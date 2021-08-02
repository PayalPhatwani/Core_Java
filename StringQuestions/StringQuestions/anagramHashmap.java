package StringQuestions;

import java.util.HashMap;

public class anagramHashmap {
    static HashMap<Character,Integer> calculationFreq(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0 ;i<s.length(); i++){
            char curr = s.charAt(i);
            if(map.containsKey(curr)){
                map.replace(curr, map.get(curr), map.get(curr)+1);
            }else{
                map.put(curr,1);
            }
        }
        return map;
    }

    static boolean isAnagram(String a, String b) {
        // Complete the function
        HashMap<Character,Integer> map1 = calculationFreq(a);
        HashMap<Character,Integer> map2 = calculationFreq(b);
        
        if(map1.keySet().equals( map2.keySet()) && map1.equals(map2)){
            return true;
        }else{
            return false;
        }
        
        
    }

  public static void main (String[ ] args) {
    System.out.println(isAnagram("aab","aa"));
     
}
}
