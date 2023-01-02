package arrays;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "heart"; //"aehtr"
        String str2 = "earth"; //"aehtr"

        isAnagram(str1,str2);

    }
    public static void isAnagram(String str1, String str2){
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        boolean isAnagram = Arrays.equals(arr1,arr2);
        System.out.println("isAnagram: " + isAnagram);

    }

}

/*
Write a  function that check if a string is build out of the same letters as another string. (Anagram Task)

            Ex: str1 = "heart"
            	str2 = "earth"

            output:
            	true

        		str1 = "java"
        		str2 = "python"

    		output:
    			false

 */