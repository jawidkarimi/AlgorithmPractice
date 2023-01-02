package arrays;

public class ClassMates_Initials {
    public static void main(String[] args) {

        String[] classmates = {"Cydeo School", "Wooden Spoon", "Java Programming", "SQL Programming", "Selenium Automation",
                "API Testing", "Database Testing", "Manual Testing"};

        printInitials(classmates);
    }

    public static void printInitials(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            String initial = arr[i].charAt(0)+"."+arr[i].charAt(arr[i].indexOf(" ")+1);
            System.out.println(initial);

        }
    }
}
/*
create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines
 */