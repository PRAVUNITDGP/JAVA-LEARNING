package com.learning.MultiThreadConcur.WaitNotify;

public class Message {

    private String msg;
    public Message(String st){
        this.msg = st;
    }
    public void setMsg(String st){
        this.msg = st;
    }
    public String getMsg(){
        return msg;
    }
}
