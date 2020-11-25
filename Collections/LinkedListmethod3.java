package Collections;
import java.util.LinkedList;
public class LinkedListmethod3 {
    public static void main(String[] args) {
        LinkedList<String> courses = new LinkedList<>();// creating LinkedList
         courses.add("spring"); courses.add("java");   courses.add("hibernate"); 
         courses.add("java"); courses.add("spring");
         courses.add("React.js");  courses.add("spring");

         courses.remove();
         System.out.println("after remove() "+courses);

         courses.remove(1);
         System.out.println("\nafter remove(1) "+courses);

         courses.remove("spring");
         System.out.println("\nafter remove(spring) "+courses);

         courses.removeFirst();
         System.out.println("\nafter removeFirst() "+courses);

         courses.removeFirstOccurrence("spring");
         System.out.println("\nafter removeFirstOccurence() "+courses);

         courses.removeLastOccurrence("spring");
         System.out.println("\nafter removeLastOccurence() "+courses);

         courses.removeLast();
         System.out.println("\nafter removeLast() "+courses);    
    }
}
