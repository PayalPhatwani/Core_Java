package Arrays;

import java.util.Scanner;
//Take 5 integer inputs from user and store them in an array.
// Again ask user to give a number. Now, tell user whether that number is present in array or not.
public class Question2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0;i<arr.length;i++){
             arr[i] = sc.nextInt();
        }
        System.out.println("enter a number:-");
        int number = sc.nextInt();
        boolean contains = false;
        for (int i : arr) {
            if(i==number){
                contains=true;
            }
        }
        System.out.println("Array a contains "+number+" ? "+contains);
        sc.close();
}
}
