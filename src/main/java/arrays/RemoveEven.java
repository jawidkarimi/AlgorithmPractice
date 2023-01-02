package arrays;

import java.util.Arrays;

public class RemoveEven {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] oddArray = removeEven(arr);
        System.out.println(Arrays.toString(oddArray));
    }

    public static int[] removeEven(int[] arr){
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int idx=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                result[idx]=arr[i];
                idx++;
            }
        }
        return result;
    }
}
