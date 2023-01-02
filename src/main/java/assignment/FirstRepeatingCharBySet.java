package assignment;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingCharBySet {
    public static void main(String[] args) {
       String str = "Java programming";

        System.out.println(firstRepeatingChar(str));

    }
    public static Character firstRepeatingChar(String str){
        // What is the time complexity of the following code? O(n)
        // create a hashSet
        Set<Character> chars=new HashSet<>(); // in here I have Space Complexity of O(n)
        // iterate over the char array and add chars into hashSet
        for(Character ch:str.toCharArray()) if (!chars.add(ch)) return ch;
        // if add ops is false return that char
        return null;
    }
}
