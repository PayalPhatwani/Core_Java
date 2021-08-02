

import java.util.Scanner;

public class dec2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many rows you want in the matrix");
        int row = sc.nextInt();
        System.out.println("Enter how many column you want in the matrix");
        int column = sc.nextInt();

        int [][] array2D = new int[row][column];
        int i=0,j=0;
        for( i=0;i<row;i++){
            for( j=0;j<column;j++){
                System.out.println("Enter value for position ="+i+","+j);
                int num = sc.nextInt();
                array2D[i][j]=num;
            }
        }

        System.out.println("Displaying 2 D array");

        for( i=0;i<row;i++){
            for( j=0;j<column;j++){
                System.out.print(array2D[i][j]+" ");
            }
            System.out.println();
        }
        

    }
}
