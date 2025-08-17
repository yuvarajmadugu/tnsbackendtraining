package com.tns.oops.inheritance;

//Parent class Person:
public class Person {
    String name;
    void displayName() {
        System.out.println("Name: " +name);
    }
}
//Single Inheritance = One parent → One child
class Student extends Person{
    int sid;
    void displaySid() {
        System.out.println("Student id: " +sid);
    }
}
//Multilevel Inheritance = Grandparent → Parent → Child
class ChessPlayer extends Student{
    int chessRank;
    void displayRank() {
        System.out.println("Chess rank: " +chessRank);
    }
}
//Hierarchical Inheritance = One parent → Many children
class Cricket extends Student{
    String teamRole;
    void displayRole(){
        System.out.println("Role of student in the team: " +teamRole);
    }
}

