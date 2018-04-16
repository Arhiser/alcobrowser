package com.arhiser.alcobrowser.model;
import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Pager implements Parcelable {

    @SerializedName("records_per_page")
    @Expose
    private Integer recordsPerPage;
    @SerializedName("total_record_count")
    @Expose
    private Integer totalRecordCount;
    @SerializedName("current_page_record_count")
    @Expose
    private Integer currentPageRecordCount;
    @SerializedName("is_first_page")
    @Expose
    private Boolean isFirstPage;
    @SerializedName("is_final_page")
    @Expose
    private Boolean isFinalPage;
    @SerializedName("current_page")
    @Expose
    private Integer currentPage;
    @SerializedName("current_page_path")
    @Expose
    private String currentPagePath;
    @SerializedName("next_page")
    @Expose
    private Integer nextPage;
    @SerializedName("next_page_path")
    @Expose
    private String nextPagePath;
    @SerializedName("previous_page")
    @Expose
    private Object previousPage;
    @SerializedName("previous_page_path")
    @Expose
    private Object previousPagePath;
    @SerializedName("total_pages")
    @Expose
    private Integer totalPages;
    @SerializedName("total_pages_path")
    @Expose
    private String totalPagesPath;

    public Integer getRecordsPerPage() {
            return recordsPerPage;
        }

    public void setRecordsPerPage(Integer recordsPerPage) {
        this.recordsPerPage = recordsPerPage;
    }

    public Integer getTotalRecordCount() {
        return totalRecordCount;
    }

    public void setTotalRecordCount(Integer totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
    }

    public Integer getCurrentPageRecordCount() {
        return currentPageRecordCount;
    }

    public void setCurrentPageRecordCount(Integer currentPageRecordCount) {
        this.currentPageRecordCount = currentPageRecordCount;
    }

    public Boolean getIsFirstPage() {
        return isFirstPage;
    }

    public void setIsFirstPage(Boolean isFirstPage) {
        this.isFirstPage = isFirstPage;
    }

    public Boolean isFinalPage() {
        return isFinalPage;
    }

    public void setIsFinalPage(Boolean isFinalPage) {
        this.isFinalPage = isFinalPage;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public String getCurrentPagePath() {
        return currentPagePath;
    }

    public void setCurrentPagePath(String currentPagePath) {
        this.currentPagePath = currentPagePath;
    }

    public Integer getNextPage() {
        return nextPage;
    }

    public void setNextPage(Integer nextPage) {
        this.nextPage = nextPage;
    }

    public String getNextPagePath() {
        return nextPagePath;
    }

    public void setNextPagePath(String nextPagePath) {
        this.nextPagePath = nextPagePath;
    }

    public Object getPreviousPage() {
        return previousPage;
    }

    public void setPreviousPage(Object previousPage) {
        this.previousPage = previousPage;
    }

    public Object getPreviousPagePath() {
        return previousPagePath;
    }

    public void setPreviousPagePath(Object previousPagePath) {
        this.previousPagePath = previousPagePath;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public String getTotalPagesPath() {
        return totalPagesPath;
    }

    public void setTotalPagesPath(String totalPagesPath) {
        this.totalPagesPath = totalPagesPath;
    }


    public static final Creator<Pager> CREATOR = new Creator<Pager>() {
        @Override
        public Pager createFromParcel(Parcel in) {
            return new Pager(in);
        }

        @Override
        public Pager[] newArray(int size) {
            return new Pager[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    protected Pager(Parcel in) {
        if (in.readByte() == 0) {
            recordsPerPage = null;
        } else {
            recordsPerPage = in.readInt();
        }
        if (in.readByte() == 0) {
            totalRecordCount = null;
        } else {
            totalRecordCount = in.readInt();
        }
        if (in.readByte() == 0) {
            currentPageRecordCount = null;
        } else {
            currentPageRecordCount = in.readInt();
        }
        byte tmpIsFirstPage = in.readByte();
        isFirstPage = tmpIsFirstPage == 0 ? null : tmpIsFirstPage == 1;
        byte tmpIsFinalPage = in.readByte();
        isFinalPage = tmpIsFinalPage == 0 ? null : tmpIsFinalPage == 1;
        if (in.readByte() == 0) {
            currentPage = null;
        } else {
            currentPage = in.readInt();
        }
        currentPagePath = in.readString();
        if (in.readByte() == 0) {
            nextPage = null;
        } else {
            nextPage = in.readInt();
        }
        nextPagePath = in.readString();
        if (in.readByte() == 0) {
            totalPages = null;
        } else {
            totalPages = in.readInt();
        }
        totalPagesPath = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        if (recordsPerPage == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(recordsPerPage);
        }
        if (totalRecordCount == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(totalRecordCount);
        }
        if (currentPageRecordCount == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(currentPageRecordCount);
        }
        dest.writeByte((byte) (isFirstPage == null ? 0 : isFirstPage ? 1 : 2));
        dest.writeByte((byte) (isFinalPage == null ? 0 : isFinalPage ? 1 : 2));
        if (currentPage == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(currentPage);
        }
        dest.writeString(currentPagePath);
        if (nextPage == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(nextPage);
        }
        dest.writeString(nextPagePath);
        if (totalPages == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(totalPages);
        }
        dest.writeString(totalPagesPath);
    }
}
