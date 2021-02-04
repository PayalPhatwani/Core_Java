package StringQuestions;

import java.util.HashMap;
import java.util.Set;

public class duplicateChar2 {
    
    public static void printDuplicateChar(String str){
        char[] strArray = str.toCharArray();
        HashMap<Character,Integer> charactersMap = new HashMap<>();

        //inserting elements in hashmap with keys respect to each char in String 
        //and values w.r.t the no. of occurrences of respective character
        for (char c : strArray) {
            if(charactersMap.containsKey(c)){
                charactersMap.put(c, charactersMap.get(c)+1);
            }else{
                charactersMap.put(c, 1);
            }
        }

        //building set containing unique keys of charactersMap
        Set<Character> characterSet = charactersMap.keySet();

        for (Character character : characterSet) {
            if(charactersMap.containsKey(character)){
                if(charactersMap.get(character) == 2){
                    System.out.println();
                }
            }
        }
        

        System.out.println(characterSet);

    }

    public static void main(String[] args) {
        printDuplicateChar("payall");
    }
}
