package com.example.demo.fetchshipment;

import java.util.Date;

public class Comments
{
    private int is_customer_notified;

    private int parent_id;

    private String comment;

    private int is_visible_on_front;

    private Date created_at;

    private int entity_id;

    public void setIs_customer_notified(int is_customer_notified){
        this.is_customer_notified = is_customer_notified;
    }
    public int getIs_customer_notified(){
        return this.is_customer_notified;
    }
    public void setParent_id(int parent_id){
        this.parent_id = parent_id;
    }
    public int getParent_id(){
        return this.parent_id;
    }
    public void setComment(String comment){
        this.comment = comment;
    }
    public String getComment(){
        return this.comment;
    }
    public void setIs_visible_on_front(int is_visible_on_front){
        this.is_visible_on_front = is_visible_on_front;
    }
    public int getIs_visible_on_front(){
        return this.is_visible_on_front;
    }
    public void setCreated_at(Date created_at){
        this.created_at = created_at;
    }
    public Date getCreated_at(){
        return this.created_at;
    }
    public void setEntity_id(int entity_id){
        this.entity_id = entity_id;
    }
    public int getEntity_id(){
        return this.entity_id;
    }
}