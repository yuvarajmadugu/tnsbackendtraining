package com.tns.arrays;

public class TwoDimArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        //3x3 matrix:
        //0th row:
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        //1st row:
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        //2nd row:
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;

        //to access elements in 2D Array:
        for(int row=0; row< arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col] +" ");
            }
            System.out.println();
        }
    }
}
