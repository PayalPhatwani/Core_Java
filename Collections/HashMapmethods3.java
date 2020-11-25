package Collections;

import java.util.HashMap;

public class HashMapmethods3 {
    public static void main(String[] args) {
        HashMap<Integer,String> names = new HashMap<>();
        names.put(1, "Tanmay"); names.put(2, "Yash");
        names.put(3, "Mansi"); names.put(4, "Yash"); 
        names.put(5, "Simmy"); names.put(6, "Aman");

        //printing all the keys that HashMap contains
        System.out.println(names.keySet());

         //printing all the values that HashMap contains
        System.out.println(names.values());

        //get value by key and default value pair
        System.out.println(names.getOrDefault(2, "Yash"));
    }
}
