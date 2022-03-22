package com.example.demo.fetchorder;
import java.util.List;
public class Address
{
    private String address_type;

    private String city;

    private String country_id;

    private int customer_address_id;

    private String email;

    private int entity_id;

    private String firstname;

    private String lastname;

    private int parent_id;

    private String postcode;

    private String region;

    private String region_code;

    private int region_id;

    private List<String> street;

    private String telephone;

    public void setAddress_type(String address_type){
        this.address_type = address_type;
    }
    public String getAddress_type(){
        return this.address_type;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return this.city;
    }
    public void setCountry_id(String country_id){
        this.country_id = country_id;
    }
    public String getCountry_id(){
        return this.country_id;
    }
    public void setCustomer_address_id(int customer_address_id){
        this.customer_address_id = customer_address_id;
    }
    public int getCustomer_address_id(){
        return this.customer_address_id;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEntity_id(int entity_id){
        this.entity_id = entity_id;
    }
    public int getEntity_id(){
        return this.entity_id;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public String getFirstname(){
        return this.firstname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    public String getLastname(){
        return this.lastname;
    }
    public void setParent_id(int parent_id){
        this.parent_id = parent_id;
    }
    public int getParent_id(){
        return this.parent_id;
    }
    public void setPostcode(String postcode){
        this.postcode = postcode;
    }
    public String getPostcode(){
        return this.postcode;
    }
    public void setRegion(String region){
        this.region = region;
    }
    public String getRegion(){
        return this.region;
    }
    public void setRegion_code(String region_code){
        this.region_code = region_code;
    }
    public String getRegion_code(){
        return this.region_code;
    }
    public void setRegion_id(int region_id){
        this.region_id = region_id;
    }
    public int getRegion_id(){
        return this.region_id;
    }
    public void setStreet(List<String> street){
        this.street = street;
    }
    public List<String> getStreet(){
        return this.street;
    }
    public void setTelephone(String telephone){
        this.telephone = telephone;
    }
    public String getTelephone(){
        return this.telephone;
    }
}