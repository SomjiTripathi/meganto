package com.example.demo.fetchorder;
import java.util.List;
public class Shipping_assignments
{
    private Shipping shipping;

    private List<Items> items;

    public void setShipping(Shipping shipping){
        this.shipping = shipping;
    }
    public Shipping getShipping(){
        return this.shipping;
    }
    public void setItems(List<Items> items){
        this.items = items;
    }
    public List<Items> getItems(){
        return this.items;
    }
}
