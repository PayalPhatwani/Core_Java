package Collections;
import java.util.Stack;
public class Stackmethods2 {
    public static void main(String[] args) {
        Stack<String> names = new Stack<String>();
        names.push("Tanmay");
        names.push("Yash");
        names.push("Rohan");
        names.push("Rahul");
        //search method:-
        System.out.println("Index of element Rohan is = "+names.search("Rohan"));

        //pop method
        System.out.println("Top of the stack is = "+names.peek());

        if(names.isEmpty()){
            System.out.println("Stack is empty");
        }else{
            System.out.println("poped element is = "+names.pop());
            System.out.println("After pop stack contains = "+names);
        }
    }
}
