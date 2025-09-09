package com.tns.collections.comparator;

public class ComparatorStudent {

    int rollNo;
    String name;
    int marks;

    ComparatorStudent(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return rollNo + " " + name + " " + marks;
    }
}
