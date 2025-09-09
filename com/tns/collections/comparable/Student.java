package com.tns.collections.comparable;

class Student implements Comparable<Student> {
    //since compareTo(classname object) is abstract method it must be implemented
    int sid;
    String name;
    int marks;

    public Student(int sid, String name, int marks){
        super();
        this.sid = sid;
        this.name = name;
        this.marks = marks;
    }

    // compareTo method (natural ordering by marks)
    @Override
    public int compareTo(Student s) {
        return this.marks - s.marks;  // ascending order
        // return s.marks - this.marks; // descending order
    }

    @Override
    public String toString() {
        return sid + " " + name + " " + marks;
    }

}
