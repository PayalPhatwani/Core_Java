package MaxminProblems;

import java.util.*;
import java.io.*;
//Find maximum and minimum 
public class maxNmin3 {
  public static void main(String args[]) throws IOException {
     
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the size of Integer Array");
       int n = Integer.parseInt(br.readLine());
    System.out.println("Enter array integers in one line separated by space.");    
       String[] arr1 = br.readLine().split(" ");
      Integer[] arr = new Integer[n];
      for(int j=0;j<n;j++){
         arr[j] = Integer.parseInt(arr1[j]);
      }
      
      Arrays.sort(arr);
      
      System.out.println("Minimum number is = "+arr[0]+"\nMaximum number is = "+arr[n-1]);
   
  }
}