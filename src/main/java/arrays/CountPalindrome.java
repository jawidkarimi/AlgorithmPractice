package arrays;

public class CountPalindrome {

    public static void main(String[] args) {
        String[] words =  {"anna", "level", "Java"};

        int countPalindrome = countPalindrome(words);
        System.out.println(countPalindrome);

    }

    public static int countPalindrome(String[] words){
        int count = 0;
        for(String each:words){
            String reverse="";
            for(int i = each.length()-1; i>=0; i--){
                reverse+=each.charAt(i);
                if(each.equalsIgnoreCase(reverse)){
                    count++;
                }
            }
        }
        return count;
    }

}
/*
write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};
            output:
                2
 */