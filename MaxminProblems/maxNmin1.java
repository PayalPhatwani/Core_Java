package MaxminProblems;
import java.io.*;
//Find maximum and minimum 
public class maxNmin1 {
  public static void main(String args[]) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter the size of Integer Array");
       int n = Integer.parseInt(br.readLine());
    System.out.println("Enter array integers in one line separated by space.");   
       String[] arr1 = br.readLine().split(" ");
      int[] arr = new int[n];
      for(int j=0;j<n;j++){
         arr[j] = Integer.parseInt(arr1[j]);
      }
      
      int max = arr[0];
      int min = arr[0];
      for(int j=0;j<n;j++){
        if(arr[j]>max){
          max = arr[j];
        }else if (arr[j]<min){
          min = arr[j];
        }
      }
      System.out.println("Minimum number is = "+min+"\nMaximum number is = "+max); 
  }
}