package com.tns.arrays.practice;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1};

        System.out.print("Duplicates: ");
        for (int i = 0; i < arr.length; i++) { //checks one element
            for (int j = i + 1; j < arr.length; j++) { //with all the other elements
                if (arr[i] == arr[j]) { //if true:
                    System.out.print(arr[i] + " "); // prints duplicate values
                }
            }
        }
    }
}
