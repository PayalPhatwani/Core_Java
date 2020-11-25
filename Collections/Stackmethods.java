package Collections;
import java.util.Stack;
public class Stackmethods{
    public static void main(String[] args) {
        //Creating instance of Stack class
        Stack<String> names = new Stack<String>();

        //checking stack is empty or not
        System.out.println("Is the stack empty? "+names.isEmpty());

        //pushing elements into stack
        names.push("Tanmay");
        names.push("Yash");
        names.push("Rohan");
        names.push("Rahul");

        //printing stack elements
        System.out.println("Stack contains = "+names);
        System.out.println("Is the stack empty? "+names.isEmpty());

    }
}