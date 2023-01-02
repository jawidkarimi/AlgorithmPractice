package arrays;

import java.util.Arrays;

public class PrintArray {
    public static void main(String[] args) {

    int[] arr ={3,2,4,6,10,6,5};

        System.out.println(Arrays.toString(arr));
        printArray(arr);

    }

    public static void printArray(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}
