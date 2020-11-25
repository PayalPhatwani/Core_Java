package CoreJavaCodingProblems;

import java.io.*;


public class TakingInput {
    public static void main(String[] args)throws Exception {
        int number1 , number2 , Result;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1st number");
        number1 = Integer.parseInt(br.readLine());
        System.out.println("Enter 2nd number");
        number2 = Integer.parseInt(br.readLine());

        Result = number1 + number2 ;
        System.out.println("Addition of the numbers are : "+Result);
    }
}