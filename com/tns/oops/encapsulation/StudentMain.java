package com.tns.oops.encapsulation;

public class StudentMain {
    public static void main(String[] args) {
            Student ob = new Student();
            ob.setSname("Yuvaraj");
            ob.setSid(6697);
//        System.out.println("Name: " +ob.getSname());
//        System.out.println("ID: " +ob.getSid());
            ob.display();
    }
}
