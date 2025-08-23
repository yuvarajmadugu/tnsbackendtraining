package com.tns.arrays;

public class arraydemo {
    public static void main(String[] args) {
        //initialization:
        int[] arr = new int[3];
        arr[0] = 10;
        arr[1] = 5;
        arr[2] = 9;
        System.out.println(arr[1]);

        //accessing of all elements using for loop:
        for(int i=0; i< arr.length; i++){
            System.out.print(arr[i] +" ");
        }
        //accessing of elements using for each loop:
        for(int num: arr){
            System.out.print(num+" ");
        }


    }
}
