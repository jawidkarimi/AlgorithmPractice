package arrays;

public class FindMinimum {
    public static void main(String[] args) {
        int[] numbers = {23,22,13,32};
        int min = minValue(numbers);
        System.out.println(min);
    }

    public static int minValue(int[] n) {
        int min = Integer.MAX_VALUE;
        for (int each : n) {
            if (each < min) {
                min = each;
            }
        }
        return min;
    }
}
