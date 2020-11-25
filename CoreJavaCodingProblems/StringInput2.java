package CoreJavaCodingProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringInput2 {
    public static void main(String[] args) throws IOException {

        // 2. By using BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your username: ");
        String username = br.readLine();
        System.out.println("Username  " + username);
    }

}