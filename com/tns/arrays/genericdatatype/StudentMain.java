package com.tns.arrays.genericdatatype;

public class StudentMain {
    public static void main(String[] args) {
        Student[] s1 = new Student[3]; //here accessed using Classname
        s1[0] = new Student(97, "yuvi", "A");
        s1[1] = new Student(98, "ram", "A");
        s1[2] = new Student(99, "ss", "B");

        for(Student val: s1){
            System.out.print(val +" "+"\n");
        }
    }
}

