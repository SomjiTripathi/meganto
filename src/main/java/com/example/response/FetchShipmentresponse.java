package com.example.response;
import java.util.Date;
import java.util.List;

import fetchshipment.Comments;
import fetchshipment.Extension_attributes;
import fetchshipment.Items;
import fetchshipment.Tracks;
public class FetchShipmentresponse
{
    private int billing_address_id;

    private Date created_at;

    private int customer_id;

    private int email_sent;

    private int entity_id;

    private String increment_id;

    private int order_id;

    private List<String> packages;

    private int shipping_address_id;

    private int store_id;

    private int total_qty;

    private Date updated_at;

    private List<Items> items;

    private List<Tracks> tracks;

    private List<Comments> comments;

    private Extension_attributes extension_attributes;

    public void setBilling_address_id(int billing_address_id){
        this.billing_address_id = billing_address_id;
    }
    public int getBilling_address_id(){
        return this.billing_address_id;
    }
    public void setCreated_at(Date created_at){
        this.created_at = created_at;
    }
    public Date getCreated_at(){
        return this.created_at;
    }
    public void setCustomer_id(int customer_id){
        this.customer_id = customer_id;
    }
    public int getCustomer_id(){
        return this.customer_id;
    }
    public void setEmail_sent(int email_sent){
        this.email_sent = email_sent;
    }
    public int getEmail_sent(){
        return this.email_sent;
    }
    public void setEntity_id(int entity_id){
        this.entity_id = entity_id;
    }
    public int getEntity_id(){
        return this.entity_id;
    }
    public void setIncrement_id(String increment_id){
        this.increment_id = increment_id;
    }
    public String getIncrement_id(){
        return this.increment_id;
    }
    public void setOrder_id(int order_id){
        this.order_id = order_id;
    }
    public int getOrder_id(){
        return this.order_id;
    }
    public void setPackages(List<String> packages){
        this.packages = packages;
    }
    public List<String> getPackages(){
        return this.packages;
    }
    public void setShipping_address_id(int shipping_address_id){
        this.shipping_address_id = shipping_address_id;
    }
    public int getShipping_address_id(){
        return this.shipping_address_id;
    }
    public void setStore_id(int store_id){
        this.store_id = store_id;
    }
    public int getStore_id(){
        return this.store_id;
    }
    public void setTotal_qty(int total_qty){
        this.total_qty = total_qty;
    }
    public int getTotal_qty(){
        return this.total_qty;
    }
    public void setUpdated_at(Date updated_at){
        this.updated_at = updated_at;
    }
    public Date getUpdated_at(){
        return this.updated_at;
    }
    public void setItems(List<Items> items){
        this.items = items;
    }
    public List<Items> getItems(){
        return this.items;
    }
    public void setTracks(List<Tracks> tracks){
        this.tracks = tracks;
    }
    public List<Tracks> getTracks(){
        return this.tracks;
    }
    public void setComments(List<Comments> comments){
        this.comments = comments;
    }
    public List<Comments> getComments(){
        return this.comments;
    }
    public void setExtension_attributes(Extension_attributes extension_attributes){
        this.extension_attributes = extension_attributes;
    }
    public Extension_attributes getExtension_attributes(){
        return this.extension_attributes;
    }
}
