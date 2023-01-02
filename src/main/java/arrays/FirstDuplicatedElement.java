package arrays;

public class FirstDuplicatedElement {
    public static void main(String[] args) {

        int[] arr1 = {12, 14, 14, 18, 18, 21, 32};
        int firstDuplicateElement = firstDuplicatedElement(arr1);
        System.out.println(firstDuplicateElement);
    }


    public static int firstDuplicatedElement(int[] array) {
        int firstDuplicated = 0;

        for (int each : array) {
            int frequency = 0;
            for (int each2 : array) {
                if (each == each2)
                    frequency++;
            }

            if (frequency > 1) {
                firstDuplicated = each;
                break;
            }
        }
        return firstDuplicated;
    }

}
/*
    write a program that can find the first duplicated element from the array
     */