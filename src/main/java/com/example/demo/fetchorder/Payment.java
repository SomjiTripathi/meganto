package com.example.demo.fetchorder;
import java.util.List;
public class Payment
{
    private String account_status;

    private List<String> additional_information;

    private int amount_ordered;

    private int amount_paid;

    private int base_amount_ordered;

    private int base_amount_paid;

    private int base_shipping_amount;

    private int base_shipping_captured;

    private String cc_exp_year;

    private String cc_last4;

    private String cc_ss_start_month;

    private String cc_ss_start_year;

    private int entity_id;

    private String method;

    private int parent_id;

    private int shipping_amount;

    private int shipping_captured;

    public void setAccount_status(String account_status){
        this.account_status = account_status;
    }
    public String getAccount_status(){
        return this.account_status;
    }
    public void setAdditional_information(List<String> additional_information){
        this.additional_information = additional_information;
    }
    public List<String> getAdditional_information(){
        return this.additional_information;
    }
    public void setAmount_ordered(int amount_ordered){
        this.amount_ordered = amount_ordered;
    }
    public int getAmount_ordered(){
        return this.amount_ordered;
    }
    public void setAmount_paid(int amount_paid){
        this.amount_paid = amount_paid;
    }
    public int getAmount_paid(){
        return this.amount_paid;
    }
    public void setBase_amount_ordered(int base_amount_ordered){
        this.base_amount_ordered = base_amount_ordered;
    }
    public int getBase_amount_ordered(){
        return this.base_amount_ordered;
    }
    public void setBase_amount_paid(int base_amount_paid){
        this.base_amount_paid = base_amount_paid;
    }
    public int getBase_amount_paid(){
        return this.base_amount_paid;
    }
    public void setBase_shipping_amount(int base_shipping_amount){
        this.base_shipping_amount = base_shipping_amount;
    }
    public int getBase_shipping_amount(){
        return this.base_shipping_amount;
    }
    public void setBase_shipping_captured(int base_shipping_captured){
        this.base_shipping_captured = base_shipping_captured;
    }
    public int getBase_shipping_captured(){
        return this.base_shipping_captured;
    }
    public void setCc_exp_year(String cc_exp_year){
        this.cc_exp_year = cc_exp_year;
    }
    public String getCc_exp_year(){
        return this.cc_exp_year;
    }
    public void setCc_last4(String cc_last4){
        this.cc_last4 = cc_last4;
    }
    public String getCc_last4(){
        return this.cc_last4;
    }
    public void setCc_ss_start_month(String cc_ss_start_month){
        this.cc_ss_start_month = cc_ss_start_month;
    }
    public String getCc_ss_start_month(){
        return this.cc_ss_start_month;
    }
    public void setCc_ss_start_year(String cc_ss_start_year){
        this.cc_ss_start_year = cc_ss_start_year;
    }
    public String getCc_ss_start_year(){
        return this.cc_ss_start_year;
    }
    public void setEntity_id(int entity_id){
        this.entity_id = entity_id;
    }
    public int getEntity_id(){
        return this.entity_id;
    }
    public void setMethod(String method){
        this.method = method;
    }
    public String getMethod(){
        return this.method;
    }
    public void setParent_id(int parent_id){
        this.parent_id = parent_id;
    }
    public int getParent_id(){
        return this.parent_id;
    }
    public void setShipping_amount(int shipping_amount){
        this.shipping_amount = shipping_amount;
    }
    public int getShipping_amount(){
        return this.shipping_amount;
    }
    public void setShipping_captured(int shipping_captured){
        this.shipping_captured = shipping_captured;
    }
    public int getShipping_captured(){
        return this.shipping_captured;
    }
}
