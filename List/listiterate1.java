package List;
//iterating elements over list
import java.util.*;
public class listiterate1 {
    public static void main(String[] args) {
        //create list
        List<String> namelist = new ArrayList<String>();
        //adding values into list
        namelist.add("payal");
        namelist.add("yash");
        namelist.add("simmy");
        namelist.add("tanmay");

        // 1. simple for loop
        System.out.println("==============> 1. Simple For loop Example.");
        for (int i = 0; i < namelist.size(); i++) {
            System.out.println(namelist.get(i));
        }

        // 2. enhanced for each loop
        System.out.println("\n==============> 2. New Enhanced For loop Example..");
        for(String names : namelist){
            System.out.println(names);
        }
    }
}