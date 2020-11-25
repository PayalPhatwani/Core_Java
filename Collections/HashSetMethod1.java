package Collections;
import java.util.HashSet;
public class HashSetMethod1 {
    public static void main(String[] args) {

        //Create a HashSet object called names that will store strings
        HashSet<String> names  = new HashSet<>();

        //Adding elements 
        names.add("Tanmay");
        names.add("Rahul");
        names.add("Jack");
        names.add("John");

        //HashSet Size
        System.out.println("Size of HashSet names is= "+names.size());
        //Check If an Item Exists
        System.out.println("HashSet contains Jack name ? "+names.contains("Jack"));

        System.out.println("HashSet = "+names);

    }
}
