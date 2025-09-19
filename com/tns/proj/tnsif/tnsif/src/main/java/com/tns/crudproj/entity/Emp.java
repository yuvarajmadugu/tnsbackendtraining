package com.tns.crudproj.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Emp {
    @Id // this annotation is user say the below variable is used as primary key
    int eid;
    String ename;
    double esal;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public double getEsal() {
        return esal;
    }

    public void setEsal(double esal) {
        this.esal = esal;
    }
}
