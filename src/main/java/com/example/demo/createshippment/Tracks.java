package com.example.demo.createshippment;
public class Tracks
{
    private String track_number;

    private String title;

    private String carrier_code;

    public void setTrack_number(String track_number){
        this.track_number = track_number;
    }
    public String getTrack_number(){
        return this.track_number;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return this.title;
    }
    public void setCarrier_code(String carrier_code){
        this.carrier_code = carrier_code;
    }
    public String getCarrier_code(){
        return this.carrier_code;
    }
}
