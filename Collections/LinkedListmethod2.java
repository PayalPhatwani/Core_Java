package Collections;

import java.util.LinkedList;

public class LinkedListmethod2 {
    public static void main(String[] args) {
        LinkedList<String> courses = new LinkedList<>();// creating LinkedList
        //adding elements
         courses.add("spring");  
         courses.add("hibernate"); 
         courses.add("java"); 
         courses.add("React.js"); 
        System.out.println("courses contains => " + courses);

        System.out.println("peek method result" + courses.peek() 
                         + "\n peekfirst= " + courses.peekFirst()
                         + "\n peeklast = " + courses.peekLast());
    
        System.out.println("poll method result" + courses.poll() 
                         + "\n pollfirst= " + courses.pollFirst()
                         + "\n polllast = " + courses.pollLast());
        
        System.out.println("courses contains => " + courses);
    }
}
