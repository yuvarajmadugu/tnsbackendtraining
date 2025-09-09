package com.tns.collections.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorStudentMain {
    public static void main(String[] args) {
        List<ComparatorStudent> students = new ArrayList<>();
        students.add(new ComparatorStudent(101, "Yuvi", 100));
        students.add(new ComparatorStudent(102, "Zuv", 78));
        students.add(new ComparatorStudent(103, "Xuv", 89));

        // Sorting using Marks
        Collections.sort(students, new SortByMarks());
        System.out.println("Sorted by Marks:");
        for (ComparatorStudent s : students) System.out.println(s);

        // Sort by name
        students.sort(new SortByName());
        System.out.println("\nSorted by Name:");
        for (ComparatorStudent s : students) System.out.println(s);

    }
}
