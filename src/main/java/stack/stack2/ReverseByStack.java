package stack.stack2;

import java.util.Stack;

public class ReverseByStack {

    public static void main(String[] args) {

        String str="1221";
        System.out.println(reverse(str));
        System.out.println(isPalindrome(str));

    }

    public static String reverse(String str){
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (char eachChar : chars) {
            stack.push(eachChar);
        }
        for (int i = 0; i < str.length(); i++) {
            chars[i]=stack.pop();
        }
        return new String(chars);
        }

    public static boolean isPalindrome(String str){
        if(str.equals(reverse(str))){
            return true;
        }
        return false;
    }
    }

