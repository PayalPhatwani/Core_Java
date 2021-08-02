import java.util.Arrays;
import java.util.Scanner;

public class fabo {

    public static int tribonacci(int[] temp,int n) {
        
     if(temp[n]!=-1) return temp[n];

     temp[n] = tribonacci(temp, n-1) + tribonacci(temp, n-2) +tribonacci(temp, n-3);
     return temp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] temp = new int[n+1];
        Arrays.fill(temp, -1);
        temp[0]=0;
        temp[1]=1;
        temp[2]=1;
        System.out.println(tribonacci(temp,n));
       
    }
}
