package Collections;
import java.util.ArrayList;
import java.util.Vector;
public class Vectormethods2 {
    public static void main(String[] args) {
        //creating vector named names
        Vector <String> vector = new Vector<>();
        //Adding elements to vector
        vector.addElement("Mansi"); vector.addElement("Tanmay");
        vector.addElement("simmy"); vector.addElement("Yash");

        System.out.println("Does names contain Mansi name ? "+vector.contains("Mansi"));

        ArrayList<String> list = new ArrayList<>();
        list.add("simmy"); list.add("Yash");

        System.out.println("Does vector contain all list elements? "+vector.containsAll(list));

        System.out.println("Element at index 2 is = "+vector.elementAt(2));

        System.out.println("first element of vector is = "+vector.firstElement());

        System.out.println("last element of vector is = "+vector.lastElement());

        System.out.println("element at index 1 is = "+vector.get(1));
    }
}
