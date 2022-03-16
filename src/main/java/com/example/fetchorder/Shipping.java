package com.example.fetchorder;
public class Shipping
{
    private Address address;

    private String method;

    private Total total;

    public void setAddress(Address address){
        this.address = address;
    }
    public Address getAddress(){
        return this.address;
    }
    public void setMethod(String method){
        this.method = method;
    }
    public String getMethod(){
        return this.method;
    }
    public void setTotal(Total total){
        this.total = total;
    }
    public Total getTotal(){
        return this.total;
    }
}