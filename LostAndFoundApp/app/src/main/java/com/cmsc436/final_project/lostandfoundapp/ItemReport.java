package com.cmsc436.final_project.lostandfoundapp;

import android.location.Address;
import android.location.Location;

import java.util.Date;
import com.google.android.gms.maps.model.LatLng;

public class ItemReport {

    public enum ReportType{
        LOST, FOUND
    };

    public enum ReportStatus {
        PENDING, RESOLVED
    };

    public enum ReportMethod{
        ADDRESS, LOCATION
    }

    private String mTitle;
    private String mDescription;
    private Date mDateOccurred;
    private Date mDateAuthored;
    private LatLng mLatLng;
    private String mAddress;
    private ReportType mType;
    private ReportMethod mMethod;
    private ReportStatus mStatus;

    public ItemReport(String mTitle, String mDescription, Date mDateOccurred, Date mDateAuthored, LatLng mLatLng, String mAddress, boolean isFound) {
        this.mTitle = mTitle;
        this.mDescription = mDescription;
        this.mDateOccurred = mDateOccurred;
        this.mDateAuthored = mDateAuthored;
        this.mLatLng = mLatLng;
        this.mAddress = mAddress;
        this.mType = (isFound) ? (ReportType.FOUND) : (ReportType.LOST);
        this.mMethod = (mAddress == null) ? (ReportMethod.LOCATION) : (ReportMethod.ADDRESS);
        this.mStatus = ReportStatus.PENDING;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public Date getDateOccurred() {
        return mDateOccurred;
    }

    public void setDateOccurred(Date mDateOccurred) {
        this.mDateOccurred = mDateOccurred;
    }

    public Date getDateAuthored() {
        return mDateAuthored;
    }

    public void setDateAuthored(Date mDateAuthored) {
        this.mDateAuthored = mDateAuthored;
    }

    public LatLng getLatLng() {
        return mLatLng;
    }

    public void setLatLng(LatLng mLatLng) {
        this.mLatLng = mLatLng;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public ReportType getType() {
        return mType;
    }

    public void setType(ReportType mType) {
        this.mType = mType;
    }

    public ReportMethod getMethod() {
        return mMethod;
    }

    public void setMethod(ReportMethod mMethod) {
        this.mMethod = mMethod;
    }

    public ReportStatus getStatus() {
        return mStatus;
    }

    public void setStatus(ReportStatus mStatus) {
        this.mStatus = mStatus;
    }

    // TODO: implement consistent system of tagging
    // (possibly store Tag objects in Firebase with report references)
}
