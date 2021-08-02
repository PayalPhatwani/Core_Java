import java.util.Arrays;
import java.util.Scanner;

/**
 * demo
 */
public class climbingStairs {
    static int possibleCount(int[] mem,int curr ,int n){
        if(curr>n) return 0;
        if(curr==n){
            System.out.println();
        return 1;
        }
        if(mem[curr]!=-1){
            return mem[curr];
        }
        System.out.print(curr+" ");
            mem[curr] = possibleCount(mem, curr+1, n) + possibleCount(mem, curr+2, n);
            return mem[curr];
        
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mem = new int[n];
        Arrays.fill(mem, -1);
        System.out.println(possibleCount(mem,0,n));
    }
}