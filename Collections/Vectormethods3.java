package Collections;
import java.util.Vector;
public class Vectormethods3 {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();
        numbers.add(1); numbers.add(2); numbers.add(3); 
        numbers.add(4); numbers.add(5); numbers.add(6);
        
        //Removing element at index 5
        numbers.remove(5);

        //Removing element containing 1
        numbers.remove(1);

        //Checking if the vector is empty or not ?
        System.out.println("is vector named numbers empty?"+numbers.isEmpty());

        //Removing elements which are divisible by 2 
        numbers.removeIf(n -> (n%2==0));

        //setting element 200 at index 1
        numbers.setElementAt(200, 1);

        //displaying elements of vector numbers on console
        numbers.forEach(i -> System.out.println(i));
        
    }
}
