package CoreJavaCodingProblems;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        int number;
        System.out.println("Please insert any number below:-");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println(+number + " is an even number.");
        } else {
            System.out.println(+number + " is an odd number.");
        }
        sc.close();
    }
}