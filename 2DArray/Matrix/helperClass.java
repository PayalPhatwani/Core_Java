package Matrix;

import java.util.Scanner;

public class helperClass {

    public static int[][] get2dArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many rows you want in the matrix");
        int row = sc.nextInt();
        System.out.println("Enter how many column you want in the matrix");
        int column = sc.nextInt();

        int [][] array2D = new int[row][column];
        int i=0,j=0;
        System.out.println("Enter 2d array values :-");
        for( i=0;i<row;i++){
            for( j=0;j<column;j++){
                int num = sc.nextInt();
                array2D[i][j]=num;
            }
        }
        return array2D;
    }

    public static void print2dArray(int [][] array2D,int row,int column){
        System.out.println("Displaying 2 D array");

        for(int i=0;i<row;i++){
            for( int j=0;j<column;j++){
                System.out.print(array2D[i][j]+" ");
            }
            System.out.println();
        }

    }
}
