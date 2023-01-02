package arrays;

public class FindMaximum {
    public static void main(String[] args) {

        int[] numbers = {12,13,18,22};
        int max = maxValue(numbers);
        System.out.println(max);
    }

    public static int maxValue(int[] n) {
        int max = Integer.MIN_VALUE;
        for (int each : n) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }
}

/*
        Write a function that can find the maximum number from an int Array
     */