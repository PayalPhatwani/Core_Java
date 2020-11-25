package Patterns;

public class Pattern6 {
    public static void main(String[] args) {
        int num=4;
        int number=1;
        for(int i=1;i<=num;i++){
            for(int j=1;j<=(num-i);j++){
                System.out.print("   ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(number++ +"    ");
            }
            System.out.println();
        }
    }
}
