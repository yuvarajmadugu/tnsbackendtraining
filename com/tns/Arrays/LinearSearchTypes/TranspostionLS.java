package DSA.Arrays.LinearSearchTypes;

import java.util.Arrays;

public class TranspostionLS {
//// this is a type of Improved Linear search an optimizing technique
//// basic idea of this technique swap found elements with prior element
    static int transpositionls(int[] arr, int x){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == x) {
                int index = i;
                if (i > 0) { // Only swap if not the first element
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
                return index;
            }
        }
        return -1; //if not found
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 5;
        int result = transpositionls(arr, target);
        if (result != -1) {
            System.out.println("Element in array found at index: " +result);
            System.out.println("Modified array after swap: " + Arrays.toString(arr));
        }
        else {
            System.out.println("Element not found in array");
        }
    }
}
