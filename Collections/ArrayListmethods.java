package Collections;
import java.util.ArrayList;
public class ArrayListmethods {
public static void main(String[] args) {

      ArrayList<String> courses = new ArrayList<>(); //CreatingArrayList
 
    // Adding elements in arraylist
    courses.add("core java");    courses.add("spring boot");   courses.add("angular");

    // Displaying the contents of arraylist on console using lambdaFunction here
    System.out.println("Arraylist courses contains");
    courses.forEach(i -> System.out.println(i));

    // Adding element on specific index
    courses.add(1, "javascript");

    // Displaying the contents of arraylist
    System.out.println("\n  Now javascript is added on index 1 and index 1 contents shift to 2");
    courses.forEach(i -> System.out.println(i));

    // Displaying the size of array
    System.out.println("\n Size of the arraylist is =  " + courses.size());
   
    ArrayList<String> courses2 = new ArrayList<>();
    courses.add("Ruby");    courses.add("python");

    courses.addAll(courses2);

    // Displaying the contents of arraylist
    System.out.println("\n After adding contents of courses2");
    courses.forEach(i -> System.out.println(i));

  }
}
