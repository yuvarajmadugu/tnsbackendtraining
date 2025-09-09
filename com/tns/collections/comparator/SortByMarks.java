package com.tns.collections.comparator;

import java.util.Comparator;

public class SortByMarks implements Comparator<ComparatorStudent> {
    //comparator is to compare objects of user defined class when class does not implement comparable interface
    //compare() method is used
    //custom sorting on collection of elements

    public int compare(ComparatorStudent s1, ComparatorStudent s2) {
        return s1.marks - s2.marks;  // ascending order
    }
}
