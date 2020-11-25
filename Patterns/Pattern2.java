package Patterns;
public class Pattern2 {
    public static void main(String[] args) {
        int num =10;
        for(int i=1 ;i<=num;i++){
            for(int j=1;j<=(num - i +1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
