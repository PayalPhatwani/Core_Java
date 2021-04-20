package Collections;

import java.util.LinkedList;

//Implementation of stack using LinkedList
public class Stackimpl {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();

        // adding elements in stack as addition always takes place from the last in stack
        stack.addLast(1);
        stack.addLast(2);
        stack.addLast(3);
        stack.addLast(4);
        stack.addLast(5);

        System.out.println("stack contains elements stated below:-");
        for (Integer integer : stack) {
            System.out.println(integer);
        }

        //deleting elements from stack
        //As deletion in stack done from the last
        // we can use pollFirst method of linkedList
        System.out.println("pooping elements....");
        while(!stack.isEmpty()){
           System.out.println(stack.pollLast()+" ");
        }
    }
}
