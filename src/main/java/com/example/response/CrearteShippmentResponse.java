package com.example.response;
import java.util.List;

import createshippment.Comment;
import createshippment.Items;
import createshippment.Tracks;
public class CrearteShippmentResponse
{
    private List<Items> items;

    private boolean notify;

    private boolean appendComment;

    private Comment comment;

    private List<Tracks> tracks;

    public void setItems(List<Items> items){
        this.items = items;
    }
    public List<Items> getItems(){
        return this.items;
    }
    public void setNotify(boolean notify){
        this.notify = notify;
    }
    public boolean getNotify(){
        return this.notify;
    }
    public void setAppendComment(boolean appendComment){
        this.appendComment = appendComment;
    }
    public boolean getAppendComment(){
        return this.appendComment;
    }
    public void setComment(Comment comment){
        this.comment = comment;
    }
    public Comment getComment(){
        return this.comment;
    }
    public void setTracks(List<Tracks> tracks){
        this.tracks = tracks;
    }
    public List<Tracks> getTracks(){
        return this.tracks;
    }
}
