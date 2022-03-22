package com.example.demo.fetchorder;
import java.util.List;
public class Extension_attributes11
{
    private List<Shipping_assignments> shipping_assignments;

    private List<Payment_additional_info> payment_additional_info;

    private List<String> applied_taxes;

    private List<String> item_applied_taxes;

    public void setShipping_assignments(List<Shipping_assignments> shipping_assignments){
        this.shipping_assignments = shipping_assignments;
    }
    public List<Shipping_assignments> getShipping_assignments(){
        return this.shipping_assignments;
    }
    public void setPayment_additional_info(List<Payment_additional_info> payment_additional_info){
        this.payment_additional_info = payment_additional_info;
    }
    public List<Payment_additional_info> getPayment_additional_info(){
        return this.payment_additional_info;
    }
    public void setApplied_taxes(List<String> applied_taxes){
        this.applied_taxes = applied_taxes;
    }
    public List<String> getApplied_taxes(){
        return this.applied_taxes;
    }
    public void setItem_applied_taxes(List<String> item_applied_taxes){
        this.item_applied_taxes = item_applied_taxes;
    }
    public List<String> getItem_applied_taxes(){
        return this.item_applied_taxes;
    }
}
