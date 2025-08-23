package com.tns.exception;

public class exceptionDemo {
    public static void main(String[] args) {
        //throws exception:
//        int c = 1/0;
//        System.out.println(c);

        //handling exception:
        try{
            //if both the cases having error the interrupter  the first error only executes then interpreter directly goes for respective catch block and error msg displays further lines are not executed.
            int d=1/0;
            System.out.println(d);


            int[] arr = {1,2,3,4,5};
            System.out.println(arr[5]);

        }catch (ArithmeticException ae){
            System.err .println("Denominator cant be zero, enter a numeric value excluding 0 " +ae);
        }catch(ArrayIndexOutOfBoundsException aiob){
            System.out.println("Array ends at index 4");
        }
    }
}
