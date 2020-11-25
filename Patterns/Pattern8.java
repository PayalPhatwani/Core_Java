package Patterns;
public class Pattern8 {
    public static void main(String[] args) {
        int n = 15;
        for(int i=1;i<=n;i++){
            if(i==1 || i==n){
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }else{
                for(int k=1;k<=2;k++){
                    System.out.print("* ");
                    for(int p=1;p<=(i-2);p++){
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
}
