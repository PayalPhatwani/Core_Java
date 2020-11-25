package List;
//iterating elements over list

import java.util.*;
public class listiterate3 {
    public static void main(String[] args) {
        //create list
        List<String> namelist = new ArrayList<String>();
        //adding values into list
        namelist.add("payal");
        namelist.add("yash");
        namelist.add("simmy");
        namelist.add("tanmay");

        // 5. while loop
        System.out.println("\n==============> 5. While Loop Example....");

        int i = 0;
        while (i < namelist.size()) {
            System.out.println(namelist.get(i));
            i++;
        }
       
        // 6. By collection Stream.forEach() 

        System.out.println("\n==============> 6. Stream.forEach() Example....");

        namelist.stream().forEach((names) -> System.out.println(names));
    }
 }
