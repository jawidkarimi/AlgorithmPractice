package recursion;

public class Factorial {
    public static void main(String[] args) {

        System.out.println(getRecursiveFactorial(3));
        System.out.println(getIterativeFactorial(3));


    }

    public static int getRecursiveFactorial(int n){
        if(n<0) return -1;
        else if (n<2) return 1;
        else return (n*getRecursiveFactorial(n-1));
    }

    public static int getIterativeFactorial(int n) {
        if (n < 0) return -1;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

}

