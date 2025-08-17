package com.tns.oops.encapsulation;

public class Student {
    //Wrapping data (variables) and methods (functions) into a single unit (class).
    //Provides data hiding using private and controlled access using getters/setters.
    //Access modifiers has private methods/variables we must use getter and setter methods:

    //Encapulation:
    private int sid;
    private String sname;

    public void setSid(int sid) { //setter method
        this.sid = sid;
    }

    public int getSid() { //getter method
        return sid;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSname() {
        return sname;
    }

    public void display() {
        System.out.println("Encapsulation ID: " + sid);
        System.out.println("Encapsulation name: " + sname);
    }
}
