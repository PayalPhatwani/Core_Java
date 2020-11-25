package Collections;

import java.util.ArrayList;

public class ArrayListmethods3 {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<>(); // CreatingArrayList
        // Adding elements in arraylist
        courses.add("core java");  courses.add("spring boot");  courses.add("angular");

        // Displaying the list
        System.out.println("First ArrayList: " + courses);

        ArrayList<String> coursescopy = new ArrayList<>(); // Creating another ArrayList
        // Created another Arraylist and copying
       // coursescopy = (ArrayList<String>) courses.clone();

        // Displaying the other Arraylist
        System.out.println(" \n Second ArrayList is: " + coursescopy);

        Object[] coursesArray = new String[courses.size()];
        //using toArray method
        coursesArray = courses.toArray(coursesArray);

         // Displaying the  Array
         System.out.println(" \n Array containing courses arraylist elements is: " + coursescopy);
    }
}
