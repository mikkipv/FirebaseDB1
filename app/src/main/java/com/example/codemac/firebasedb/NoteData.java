package com.example.codemac.firebasedb;

import com.google.firebase.database.IgnoreExtraProperties;

import java.util.Date;

/**
 * Created by codemac on 4/7/17.
 */

@IgnoreExtraProperties
public class NoteData {


    String title;
    Date dateLastUpdated;
    String content;

    public NoteData()
    {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDateLastUpdated() {
        return dateLastUpdated;
    }

    public void setDateLastUpdated(Date dateLastUpdated) {
        this.dateLastUpdated = dateLastUpdated;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
