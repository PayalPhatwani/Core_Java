package Collections;
import java.util.ArrayList;
public class ArrayListmethods2 {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>(); //CreatingArrayList
        // Adding elements in arraylist
        courses.add("core java");    courses.add("spring boot");   courses.add("angular");
    
        // Displaying the contents of arraylist on console using lambdaFunction here
        System.out.println("Arraylist courses contains \n");
        courses.forEach(i -> System.out.println(i));
        //displaying element at index 1
        System.out.println("\n  element at index 1 is = "+courses.get(1));

        //setting course at index 1 from spring boot to Node.js
        courses.set(1, "Node.js");
        System.out.println("\n  element at index 1 is(After set method) = "+courses.get(1));

        System.out.println("\n  elements in arraylist before removing element at 2");
        courses.forEach(i -> System.out.println(i));

        //removing element at index 1
        courses.remove(2);
        System.out.println("\n  elements in arraylist after removing element at 2");
        courses.forEach(i -> System.out.println(i));
    
    }
}
