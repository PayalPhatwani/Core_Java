package Generics;

import java.util.*;
class San
{

      // Complete the isValid function below.
    static String isValid(String s) {
        
      HashMap<Character,Integer> map = new HashMap<>();
      for(int i=0 ; i <s.length() ; i++){
          char curr = s.charAt(i);
          if(map.containsKey(curr)){
              int val = map.get(curr);
              map.replace(curr,val,val+1);
          }else{
              map.put(curr,1);
          }
      }
      
     int count = 0;
     int count1 = 0;
     Iterator iter = map.entrySet().iterator();
     Iterator iter2 = map.entrySet().iterator();
  try {
      while (iter.hasNext()) {
      Map.Entry entry = (Map.Entry) iter.next();
      int currVal = Integer.parseInt((String)entry.getValue());
      
      while (iter.hasNext()) {
      Map.Entry entry1 = (Map.Entry) iter.next();
       count = Math.abs(currVal - Integer.parseInt((String)entry1.getValue()));
       System.out.println(count);
       if(count >1){
           return "NO";
       }
       if(count==1){
           count1++;
       }
       if(count1>1){
           return "NO";
       }
      }
  }
  } 
  catch(Exception e ){
      System.out.println("exception");
      System.out.println(map);
      System.out.println(count1);
  }
      
     return "YES"; 
  }

  public static void main (String[ ] args) {
      isValid("aabbcd");
     
}
}