//Write a program to print fibonacci series.
package interviewPrograms;
public class Question4 {
    public static void main(String[] args) {
        int febNumber = 10;
        int [] arrFeb = new int [febNumber];
        arrFeb[0]=0;
        arrFeb[1]=1;
        for(int i=2;i<febNumber;i++){
            arrFeb[i] = arrFeb[i-1] + arrFeb[i-2];
        }
        System.out.print("Fibonacci series:- \n");
        for(int i=0; i< febNumber; i++){
                 System.out.print(arrFeb[i] + " ");
         }
    }
}
