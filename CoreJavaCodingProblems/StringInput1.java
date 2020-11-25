package CoreJavaCodingProblems;

import java.util.Scanner;

public class StringInput1 {
    public static void main(String[] args) {

        // 1. By using scanner class(available since Java 1.5)
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = scan.nextLine();

        System.out.println("Username= " + username);
        scan.close();
    }
}