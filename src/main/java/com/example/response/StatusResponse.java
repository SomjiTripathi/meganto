package com.example.response;

import com.example.statusupdate.Entity;

public class StatusResponse
{
    private Entity entity;

    public void setEntity(Entity entity){
        this.entity = entity;
    }
    public Entity getEntity(){
        return this.entity;
    }
}