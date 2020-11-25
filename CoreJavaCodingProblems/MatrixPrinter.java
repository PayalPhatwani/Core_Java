package CoreJavaCodingProblems;

import java.io.*;
public class MatrixPrinter {
    public static void main(String[] args)throws IOException,NumberFormatException {
        BufferedReader br = 
                new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the number of rows of matrix"); 
       int row=  Integer.parseInt(br.readLine());    
       
       System.out.println("Enter the number of columns of matrix"); 
       int col =  Integer.parseInt(br.readLine());    
        int num[][] = new int[row][col];
        int x , y ;
        System.out.println("Please enter "+row*col+" integer values");
        for(x=0;x<row;x++){
            for(y=0;y<col;y++){
                num[x][y]= Integer.parseInt(br.readLine());
            }
        }
        System.out.println("Matrix is display below:-");
        for(x=0;x<row;x++){
            for(y=0;y<col;y++){
                System.out.print(" "+num[x][y]);
            }
            System.out.println();
        }
        
    }
}