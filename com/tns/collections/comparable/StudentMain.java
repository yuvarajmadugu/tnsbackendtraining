package com.tns.collections.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Yuvi", 100));
        students.add(new Student(102, "Uv", 78));
        students.add(new Student(103, "Yuv", 89));

        // Sorting using Comparable
        Collections.sort(students);

        System.out.println("Sorted Students by Marks:");
        for (Student ans : students) {
            System.out.println(ans);
        }
    }
}
