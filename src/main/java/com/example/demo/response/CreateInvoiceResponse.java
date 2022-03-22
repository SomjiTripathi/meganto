package com.example.demo.response;
public class CreateInvoiceResponse
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