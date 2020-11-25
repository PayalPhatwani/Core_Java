package CoreJavaCodingProblems;
import java.util.Scanner;
public class NumberTable 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
	System.out.print("Enter number:");        
    int n=s.nextInt();
    System.out.println("Table of "+n+" :-");
        for(int i=1; i <= 10; i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
        s.close();
    }
}