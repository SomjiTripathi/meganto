package com.example.demo.fetchorder;
public class Configurable_item_options
{
    private String option_id;

    private int option_value;

    public void setOption_id(String option_id){
        this.option_id = option_id;
    }
    public String getOption_id(){
        return this.option_id;
    }
    public void setOption_value(int option_value){
        this.option_value = option_value;
    }
    public int getOption_value(){
        return this.option_value;
    }
}