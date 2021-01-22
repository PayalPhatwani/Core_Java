package String;

import java.util.*;

//print  characters which occur more than once  from a string
public class OccurrenceOfChar {

    static int CountOccurence(String mainStr,String str){
        String strDemo = mainStr.replaceAll(str,"");
        return mainStr.length() - strDemo.length();
    }

    public static void main(String[] args) {
        String str = "Javavv";
       HashMap<Character,Integer> occurranceOfChar = new HashMap<>();
        for (int i=0; i<str.length();i++){
            int count = CountOccurence(str, Character.toString(str.charAt(i)));
            if(count > 1){
                occurranceOfChar.put(str.charAt(i), count);
            }
        }

        System.out.println(occurranceOfChar);
    }
}
