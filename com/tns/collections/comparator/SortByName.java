package com.tns.collections.comparator;

import java.util.Comparator;

public class SortByName implements Comparator<ComparatorStudent> {
    public int compare(ComparatorStudent s1, ComparatorStudent s2){
        return s1.name.compareTo(s2.name); //alphabetical order
    }
}
