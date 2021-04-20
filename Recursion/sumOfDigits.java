package Recursion;

public class sumOfDigits {
int sum = 0;
    int calculationSum(int number){
        if(number == 0){
            return 0;
        }
         sum = number % 10; // adding last digit of number
        return sum + calculationSum(number/10); 
    }

    public static void main(String[] args) {
        sumOfDigits s = new sumOfDigits();
       System.out.println(s.calculationSum(123));
    }
}
