package com.tns.arrays;
//demo for jacked arrays
public class JackedArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][]; // rows
        arr[0] = new int[3]; //0th row is having 3 cols
        arr[1] = new int[4]; //1st row is having 4 cols
        arr[2] = new int[1]; //2nd row is having 1 col

        //assigning elements in the array:
        //0th row:
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        //1st row:
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[1][3] = 7;
        //2nd row:
        arr[2][0] = 8;


        //to access elements in 2D/Jacked Array:
        for(int row=0; row< arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col] +" ");
            }
            System.out.println();
        }

    }
}
