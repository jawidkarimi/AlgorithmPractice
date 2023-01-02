package arrays;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {

        int[] numbers = {8,1,0,2,1,0,3};
        moveZeros(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    public static void moveZeros(int[] arr){
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0 && arr[j]==0){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }
    }
}
