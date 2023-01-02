package arrays;

public class UniqueElements {

    public static void main(String[] args) {

        int[] array = {1, 1, 2, 3, 3, 3, 4, 5, 5, 5, 5};

        for (int element : array) {

            int count = 0;
            for (int each : array) {
                if (each == element) {
                    count++;
                }
            }

            if(count==1){
                System.out.println(element);
            }

        }

    }

}

/*
Write a program that can display the unique elements of an array
 */