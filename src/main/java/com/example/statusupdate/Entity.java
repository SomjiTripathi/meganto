package com.example.statusupdate;
public class Entity
{
    private int entity_id;

    private String status;

    private String increment_id;

    public void setEntity_id(int entity_id){
        this.entity_id = entity_id;
    }
    public int getEntity_id(){
        return this.entity_id;
    }
    public void setStatus(String status){
        this.status = status;
    }
    public String getStatus(){
        return this.status;
    }
    public void setIncrement_id(String increment_id){
        this.increment_id = increment_id;
    }
    public String getIncrement_id(){
        return this.increment_id;
    }
}