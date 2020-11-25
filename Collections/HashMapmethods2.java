package Collections;

import java.util.HashMap;

public class HashMapmethods2 {
    public static void main(String[] args) {
        HashMap<Integer,String> names = new HashMap<>();
        names.put(1, "Tanmay"); names.put(2, "Yash");
        names.put(3, "Mansi"); names.put(4, "Yash"); 
        names.put(5, "Simmy"); names.put(6, "Aman");
        
        //iterating HashMap using lambda function
        names.forEach((k,v) -> System.out.println(" Value at "+k+" is "+v));
        
        //replacing value Simmy to Sanjana
        System.out.println("value at 5 = "+names.get(5));
        names.compute(5, (k,v)->v.replaceAll("Simmy", "Sanjana"));
        System.out.println("After replacing value at 5= "+names.get(5));

        //Checking HashMap contains key 4 or not 
        System.out.println("HashMap contains key 4 or not? "+names.containsKey(4));

         //Checking HashMap contains value Yash or not 
        System.out.println("HashMap contains value Yash or not? "+names.containsValue("Yash"));

    }
}
