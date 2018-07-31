package com.bignerdranch.android.criminalintent;

import java.text.DateFormat;
import java.util.Date;
import java.util.UUID;

public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    private boolean mRequiresPolice;

    public Crime(){
        this(UUID.randomUUID());
    }

    public Crime(UUID id){
        mId = id;
        mDate = new Date();
    }

    public static String getFormatedDate(Date date){
        DateFormat format = DateFormat.getDateInstance(DateFormat.FULL);
        return format.format(date);
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public boolean isRequiresPolice(){
        return mRequiresPolice;
    }

    public void setRequiresPolice(boolean requiresPolice){
        mRequiresPolice = requiresPolice;
    }
}
