package arrays;

public class MissingNumber {
    public static void main(String[] args) {

     int[] numsArr = {3,0,1};
        int missingNumber = missingNumber(numsArr);
        System.out.println(missingNumber);

     int[] numsArr1 = {1,2,3,4};
     int sumOfAllElements = sumOfArrayElements(numsArr1);
        System.out.println(sumOfAllElements);
    }

    public static int missingNumber(int[] nums){
        int sumArr=0;
        for(int i: nums){
            sumArr+=i;              //sumArr=4
        }
        int n=nums.length;          //n = 3
        int sumAll=n*(n+1)/2;       //sumAll = 6
        return sumAll - sumArr;     //6-4 = 2
    }




    public static int sumOfArrayElements(int[] numbers){
        int n = numbers.length;
        int sumAll = n*(n+1)/2;
        return sumAll;
    }

}
