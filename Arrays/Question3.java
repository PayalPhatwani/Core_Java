package Arrays;
//Write a program to shift every element of an array to circularly right.
public class Question3 {
     public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int t = a[a.length-1];
        System.out.println("Before Circular shift");
        for(int i=0;i<=4;i++){
             System.out.print(a[i]+" ");
        }
        for(int i=a.length-1 ;i>=1;i--){
             a[i] = a[i-1];
        }
        a[0]=t;
        System.out.println("");
        System.out.println("After circular shift");
        for(int i=0;i<=4;i++){
             System.out.print(a[i]+" ");
        }
      
    }
}
