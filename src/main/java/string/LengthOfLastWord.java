package string;

public class LengthOfLastWord {
    public static void main(String[] args) {

        String sentence = "Hello World   ";

        int length = lengthOfLastWord(sentence);
        System.out.println(length);
    }

    public static int lengthOfLastWord(String s){
        int n = s.length();   // n = 11
        while (n>0 && s.charAt(n-1)==' ') n--;
        int i = n-1;
        while (i>-1 && s.charAt(i) !=' ') i--;
        return n-1-i;
    }

}
