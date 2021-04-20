package Recursion;

public class factorial {

    int calculateFactorial(int number){
        if(number==1){
            return 1;
        }else{
            return number * calculateFactorial(number-1);
        }
    }


    public static void main(String[] args) {
        factorial f = new factorial();
       System.out.println(f.calculateFactorial(4));
    }
}
