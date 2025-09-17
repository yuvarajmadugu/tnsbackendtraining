package com.tns.generics;

public class GenericDemo<T> {
    private T msg;

    public void setMsg(T msg) {
        this.msg = msg;
    }
    public T getMsg(){
        return msg;
    }

}
