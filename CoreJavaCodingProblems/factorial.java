package CoreJavaCodingProblems;
import java.util.Scanner;
public class factorial {

    public static void fac(int number1){
        int number2=1;
        System.out.println("Factorial of "+number1+" :-");
        for(int i=number1;i>=1;i--){
            number2=i*number2;
            System.out.print(i+"*");
        }
            System.out.println(" = "  +number2);
            System.out.println("Result of factorial is = "+number2);
    }
    public static void main(String[] args) {
        int number1;
        System.out.println("Please insert a number");
        Scanner sc = new Scanner(System.in);
        number1 = sc.nextInt();
        if(number1<0){
            System.out.println("Error!!! Please insert only positive number \n Insert number again");
            number1 = sc.nextInt();
            fac(number1);
            sc.close();
        }
        else{
           fac(number1);   
        }
    }
}