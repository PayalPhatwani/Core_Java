package CoreJavaCodingProblems;

import java.math.*;
import java.util.*;

public class FindPrime {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter a Number ");

        BigInteger n = scanner.nextBigInteger();

        // isProbablePrime method of BigInteger Class returns true if the value is prime
        // or false if its not
        System.out.println(n.isProbablePrime(1) ? "prime" : "not prime");

        scanner.close();

    }
}
