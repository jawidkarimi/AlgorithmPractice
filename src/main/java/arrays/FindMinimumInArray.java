package arrays;

public class FindMinimumInArray {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int minimum = findMinimum(numbers);
        System.out.println(minimum);
    }

    public static int findMinimum(int[] arr){

        if(arr == null || arr.length ==0){
            throw new IllegalArgumentException("Invalid input");
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
