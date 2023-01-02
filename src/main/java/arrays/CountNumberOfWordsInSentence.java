package arrays;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfWordsInSentence {
    public static void main(String[] args) {
       String sentence = "This is an example of example";
       findWordOccurnce(sentence);
    }

    public static void findWordOccurnce(String sentence){
        Map<String, Integer> words = new HashMap<>();
        for(String word: sentence.split(" ")){
            if(words.containsKey(word)){
                words.put(word,words.get(word)+1);
            } else{
                words.put(word, 1);
            }
        }
        System.out.println(words);
    }
}
