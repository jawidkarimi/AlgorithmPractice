package arrays;

import java.util.Arrays;

public class ReverseArray1 {
    public static void main(String[] args) {

        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9};

        int[] reversedNumber = reverseArray(numbers);
        System.out.println(Arrays.toString(reversedNumber));

    }
    public static int[] reverseArray(int[]arr){
        int idx=0;
        int[] result = new int[arr.length];
        for (int i = arr.length-1; i >= 0; i--) {
            result[idx]=arr[i];
            idx++;
        }
        return result;
    }


}
