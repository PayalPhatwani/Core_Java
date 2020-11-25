package Collections;
import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListmethods1 {
    public static void main(String[] args) {
        LinkedList<String> courses = new LinkedList<>();// creating LinkedList
        courses.add("spring");
        courses.add("hibernate");
        courses.add("React.js"); // adding elements
        System.out.println("courses contains => " + courses);

        courses.addFirst("java");// adding element at first
        courses.addLast("javaScript");// adding element at last

        System.out.println("\nAfter addFirst & addlAst method now courses contains => " + courses);
        
        //using indexOf method
        System.out.println("\nIndex of spring course " + courses.indexOf("spring")); 
        
        // using contains method
        System.out.println("\nCourses contain spring? " + courses.contains("spring")); 

        System.out.println("\nCourses contains :-");
        ListIterator<String> listIterator = courses.listIterator(); //using Listiterator
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

    }
}