package Collections;
import java.util.Vector;
public class Vectormethods1 {
    public static void main(String[] args) {
        //creating vector named names
        Vector <String> names = new Vector<>();
       
        //Adding elements to vector
        names.addElement("Mansi"); 
        names.addElement("Tanmay");
        names.addElement("simmy");
        names.addElement("Yash");
        
        //displaying the elements of vector using lambda function
        names.forEach(i -> System.out.println(i));
        
        //checking the capacity of vector 
        System.out.println("Capacity of vector is = "+names.capacity());
       
        //checking the size of vector
        System.out.println("Size of vector is = "+names.size());

        //setting the size of vector to 20
        names.setSize(20);
        System.out.println(" size of vector is = "+names.size());
    }
}
