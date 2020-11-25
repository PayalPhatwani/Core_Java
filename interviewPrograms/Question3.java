//Write a program to find the sum of the first 1000 prime numbers.
package interviewPrograms;
public class Question3 {
     public static int getSum(){
        int number =2; int count = 0; int sum =0;
        while(count<1000){
            if(isPrime(number)){
                sum +=number;
                count++;
            }
             number++;
        }
        return sum;
    }
    private static boolean isPrime(int number){
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Sum of first 1000 prime numbers is ="+getSum());
    }
}
