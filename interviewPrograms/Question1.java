package interviewPrograms;

//Que.1 => How to swap two numbers without using temporary variable?
public class Question1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before Swaping \na = "+a+"\nb = "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swaping\na = "+a+"\nb = "+b);
    }
}
