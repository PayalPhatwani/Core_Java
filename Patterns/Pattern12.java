package Patterns;

public class Pattern12 {
    public static void main(String[] args) {
        int n =5;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=n-1;j++){
                System.out.print(" ");
                for (int k = 1; k <= (2*i -1) ;k++) {
                    if( k==1 || i == n || k==(2*i-1)) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
            }
        }
    }

