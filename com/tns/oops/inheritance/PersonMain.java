package com.tns.oops.inheritance;

public class PersonMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Yuvi";       // Inherited property
        s1.sid = 97;             // Own property

        Cricket c1 = new Cricket();
        c1.name = "Yuvi";
        c1.sid = 6697;
        c1.teamRole = "Captain";

        ChessPlayer chessobj = new ChessPlayer();
        chessobj.chessRank = 1;
        chessobj.sid = 2216697;
        chessobj.name = "Uv";

        s1.displayName();         // Inherited method
        s1.displaySid();          // Own method

        c1.displayRole();

        chessobj.displayRank();
    }
}
