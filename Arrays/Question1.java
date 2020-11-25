package Arrays;

import java.util.Scanner;

//Take 5 integer inputs from user and store them in an array and print them on screen.
public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        for(int i=0;i<a.length;i++){
             a[i] = sc.nextInt();
        }
        System.out.println("Array a contains:-");
        for (int i : a) {
            System.out.println(i);
        }
        sc.close();
    }
}
