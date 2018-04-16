package com.arhiser.alcobrowser.experimental.components;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import com.arhiser.alcobrowser.experimental.components.actions.ActionController;
import com.arhiser.alcobrowser.experimental.components.view.ViewHolder;
import com.arhiser.alcobrowser.experimental.components.viewmodel.ModelHolder;
import com.arhiser.alcobrowser.experimental.components.viewmodel.ViewModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import io.reactivex.Observer;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.BehaviorSubject;

public abstract class BaseActivity extends AppCompatActivity implements ModelHolder {

    private static final String KEY_MODEL = "BaseActivity.KEY_MODEL";

    private HashMap<Class<? extends ViewModel>, ViewHolder> viewHolders = new HashMap<>();
    private HashMap<Class<? extends ViewModel>, BehaviorSubject<ViewModel>> subjects = new HashMap<>();
    private HashMap<Class<? extends ActionController>, ActionController> controllers = new HashMap<>();
    private ArrayList<ViewModel> models = new ArrayList<>();

    private HashMap<Class<? extends ViewModel>, Runnable> updateDispatchers = new HashMap<>();

    private Handler handler = new Handler();

    protected abstract int getLayoutId();
    protected abstract void createModels();
    protected abstract void createControllers(Map<Class<? extends ViewModel>, BehaviorSubject<ViewModel>> subjects);
    protected abstract void createViewHolders(View view, Bundle savedInstanceState, Map<Class<? extends ActionController>, ActionController> controllers);

    protected <T extends ViewModel, I extends ActionController> void registerViewHolder(Class<T> clazz, ViewHolder<T, I> viewHolder) {
        viewHolders.put(clazz, viewHolder);
        if (viewHolder.getControllerClass() != null) {
            viewHolder.attachActionController((I)controllers.get(viewHolder.getControllerClass()));
        }
        getSubjectForClass(clazz).subscribe(model -> viewHolder.bind(model));
    }

    protected <T extends ViewModel> void registerViewModel(T model) {
        models.add(model);
        BehaviorSubject<T> subject = BehaviorSubject.create();
        subject.onNext(model);
        subjects.put(model.getClass(), (BehaviorSubject<ViewModel>) subject);
        updateDispatchers.put(model.getClass(), () -> subject.onNext(model));
    }

    protected <T extends ActionController> void registerActionController(ActionController controller) {
        controllers.put(controller.getClass(), controller);
    }

    protected <T extends ViewModel> BehaviorSubject<T> getSubjectForClass(Class<T> clazz) {
        return (BehaviorSubject<T>) subjects.get(clazz);
    }

    @Override
    public <T extends ViewModel> T getModel(Class<T> clazz) {
        BehaviorSubject<T> subject = (BehaviorSubject<T>) subjects.get(clazz);
        return subject.getValue();
    }

    @Override
    public <T extends ViewModel> T getModelToEdit(Class<T> clazz) {
        BehaviorSubject<T> subject = (BehaviorSubject<T>) subjects.get(clazz);
        Runnable updateDispatch = updateDispatchers.get(clazz);
        handler.removeCallbacks(updateDispatch);
        handler.post(updateDispatch);
        return subject.getValue();
    }

    @Override
    public <T extends ViewModel> void subscribeForModel(Class<T> clazz, Consumer<T> consumer) {
        subjects.get(clazz).subscribe((Observer<? super ViewModel>) consumer);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View view = LayoutInflater.from(this).inflate(getLayoutId(), null, false);
        setContentView(view);
        restoreModel(savedInstanceState);
        createComponents(view, savedInstanceState);
        for (Runnable dispatcher: updateDispatchers.values()) {
            dispatcher.run();
        }
        if (savedInstanceState == null) {
            for(ViewHolder holder: viewHolders.values()) {
                holder.onFirstStart();
            }
        }
    }

    private void restoreModel(Bundle savedInstanceState) {
        if (savedInstanceState != null && savedInstanceState.containsKey(KEY_MODEL)) {
            models.clear();
            for(Parcelable parcelable: Objects.requireNonNull(savedInstanceState.getParcelableArrayList(KEY_MODEL))) {
                registerViewModel((ViewModel) parcelable);
            }
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        if (!models.isEmpty()) {
            outState.putParcelableArrayList(KEY_MODEL, models);
        }
        super.onSaveInstanceState(outState);
    }

    private void createComponents(View view, Bundle savedInstanceState) {
        if (savedInstanceState == null) {
            createModels();
        }
        createControllers(subjects);
        createViewHolders(view, savedInstanceState, controllers);
    }

    @Override
    protected void onDestroy() {
        for (ActionController controller: controllers.values()) {
            controller.onDestroy();
        }
        super.onDestroy();
    }
}
