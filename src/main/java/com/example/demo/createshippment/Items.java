package com.example.demo.createshippment;
public class Items
{
    private int order_item_id;

    private int qty;

    public void setOrder_item_id(int order_item_id){
        this.order_item_id = order_item_id;
    }
    public int getOrder_item_id(){
        return this.order_item_id;
    }
    public void setQty(int qty){
        this.qty = qty;
    }
    public int getQty(){
        return this.qty;
    }
}