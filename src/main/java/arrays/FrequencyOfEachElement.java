package arrays;

import java.util.*;

public class FrequencyOfEachElement {
    public static void main(String[] args) {

       String[] testArray = {"Apple","Banana","Apple","Cherry"};

        System.out.println("---------------1stMethod------------------------");

       Map<String,Integer> freqOfElement = frequencyOfEachElement(testArray);
       System.out.println(freqOfElement);

       System.out.println("----------------SecondMethod-------------------------");

       frequencyOfEachElement1(testArray);

       System.out.println("-----------------3rdMethod---------------------");

        frequencyOfEachElement2(testArray);

    }


        public static Map<String, Integer> frequencyOfEachElement(String[] arr){
        Map<String, Integer> map = new LinkedHashMap<>();
        for(String each: arr){
            int frequency=0;
            for(String s: arr){
                if(each.equalsIgnoreCase(s)){
                    frequency++;
                }
            }
            map.put(each,frequency);
        }
        return map;
    }

        public static void frequencyOfEachElement1(String[] arr) {
            List<String> temp = Arrays.asList(arr);
            for (String s : new LinkedHashSet<>(temp)) {
                System.out.println(s + "=" + Collections.frequency(temp, s));
            }

/*
    Given the array return the output
                testArray = {"Apple","Banana","Apple","Cherry"}
                Output Example
                Apple = 2
                Banana = 1
                Cherry = 1
     */

        }

        public static void frequencyOfEachElement2(String[] arr){

            Arrays.stream(arr).distinct().forEach( e ->
                    System.out.println(e+"="+Arrays.stream(arr).filter( p -> p.equals(e)).count() ));


        }
}
