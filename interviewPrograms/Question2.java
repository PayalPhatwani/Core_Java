//Que2 => Write a program to find sum of each digit in the given number using recursion.
package interviewPrograms;
public class Question2 {
    static int sum =0;
    public static int getSum(int number){
        if(number==0){
            return sum;
        }else{
             sum += (number%10);
            getSum(number/10);
        }
        return sum;
    }
    public static void main(String[] args) {
        int number = 111;
        System.out.println("Sum = "+getSum(number));
    }
}
