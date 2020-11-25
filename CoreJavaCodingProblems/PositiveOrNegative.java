package CoreJavaCodingProblems;
import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        int number;
        System.out.println("Please enter any number");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        
        if(number<0){
            System.out.println(+number+" is a negative number");
        }else{
            System.out.println(+number+" is a positive number");
        }
        sc.close();
    }
}