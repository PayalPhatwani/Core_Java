package CoreJavaCodingProblems;

public class Calculator {
    public static void main(final String[] args) {
        final int number1 = 6;
        final int number2 = 3;

        int add, sub,mul;
        float div;
        add = number1 + number2;
        sub = number1 - number2;
        mul = number1 * number2;
        div = number1 / number2;

        System.out.println("Addition result: "+add);
        System.out.println("Substraction result: "+sub);
        System.out.println("Multiplication result: "+mul);
        System.out.println("division result: "+div);
    }
}