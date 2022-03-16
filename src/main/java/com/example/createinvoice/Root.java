package com.example.createinvoice;
public class Root
{
    private boolean capture;

    private boolean notify;

    public void setCapture(boolean capture){
        this.capture = capture;
    }
    public boolean getCapture(){
        return this.capture;
    }
    public void setNotify(boolean notify){
        this.notify = notify;
    }
    public boolean getNotify(){
        return this.notify;
    }
}