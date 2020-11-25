package CoreJavaCodingProblems;

import java.io.Console;

public class StringInput3 {
    public static void main(String[] args) {
        // 3. By using Console Class(available since Java 1.6)
        Console console = System.console();

        System.out.print("Enter your username: ");
        String username = console.readLine();
        System.out.println(username);

        // Note:- Does not work in non-interactive environment (such as in an IDE).
    }
}