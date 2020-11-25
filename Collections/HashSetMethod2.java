package Collections;
import java.util.HashSet;
import java.util.Iterator;
public class HashSetMethod2 {
    public static void main(String[] args) {
        HashSet<String> names  = new HashSet<>();
        names.add("Tanmay");
        names.add("Rahul");
        names.add("Jack");
        names.add("John");
        //Removing element
        names.remove("Tanmay");

        //Iterating over hashSet elements
        Iterator<String> i = names.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        names.clear();//Removing all elements
        
        //Checking if the set is empty or not 
        System.out.println("is HashSet is Empty? "+names.isEmpty());
    }
}
