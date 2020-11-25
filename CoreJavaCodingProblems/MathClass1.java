package CoreJavaCodingProblems;

import java.util.Scanner;

public class MathClass1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer");
        int number = sc.nextInt();

        // printing square root and cube root of the number by using method sqrt() and
        // cbrt() of Math class repectively
        System.out.println(" Square root = " + Math.sqrt(number) + "\n Cube root = " + Math.cbrt(number));
        sc.close();
    }
}