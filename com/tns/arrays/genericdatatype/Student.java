package com.tns.arrays.genericdatatype;

public class Student {
    int sid;
    String sname;
    String section;

    //if void is written in between java thinks as it is a method therefore no void then it is considered as a constructor
    public Student(int sid, String sname, String ssection){
        this.sid = sid;
        this.sname = sname;
        this.section = ssection;
    }

    public String toString() {
        return sid + " " + sname + " " + section;
    }

}
