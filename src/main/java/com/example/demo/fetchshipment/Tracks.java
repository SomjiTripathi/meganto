package com.example.demo.fetchshipment;

import java.util.Date;

public class Tracks
{
    private int order_id;

    private Date created_at;

    private int entity_id;

    private int parent_id;

    private Date updated_at;

    private String weight;

    private String qty;

    private String description;

    private String track_number;

    private String title;

    private String carrier_code;

    public void setOrder_id(int order_id){
        this.order_id = order_id;
    }
    public int getOrder_id(){
        return this.order_id;
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
    public void setParent_id(int parent_id){
        this.parent_id = parent_id;
    }
    public int getParent_id(){
        return this.parent_id;
    }
    public void setUpdated_at(Date updated_at){
        this.updated_at = updated_at;
    }
    public Date getUpdated_at(){
        return this.updated_at;
    }
    public void setWeight(String weight){
        this.weight = weight;
    }
    public String getWeight(){
        return this.weight;
    }
    public void setQty(String qty){
        this.qty = qty;
    }
    public String getQty(){
        return this.qty;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return this.description;
    }
    public void setTrack_number(String track_number){
        this.track_number = track_number;
    }
    public String getTrack_number(){
        return this.track_number;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setCarrier_code(String carrier_code){
        this.carrier_code = carrier_code;
    }
    public String getCarrier_code(){
        return this.carrier_code;
    }
}