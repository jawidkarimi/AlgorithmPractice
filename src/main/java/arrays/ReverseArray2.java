package arrays;

import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9};
        int[] numbers1 = reverseArray2(numbers,6,numbers.length-1);

        System.out.println(Arrays.toString(numbers1));
    }



    public static int[] reverseArray2(int[]numbers, int start, int end){
        while (start<end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end]= temp;
            start++;
            end--;
        }

        return numbers;
    }
}
