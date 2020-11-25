package Arrays;
//reverse Array
public class Question7 {
    public static void main(String[] args) {
        int [] arrayInt = {1,2,3,4,5,6};
        int [] revArrayInt = new int[arrayInt.length];
        int arrayLength = arrayInt.length;
        int index=0;
        System.out.println("original array :-");
          for (int i : arrayInt) {
              System.out.print(i+" ");
          }
        for(int i=arrayLength-1;i>=0;i--){
            revArrayInt[index++]= arrayInt[i];
        }   
         for(int i=0;i<arrayLength;i++){
             arrayInt[i]= revArrayInt[i];
         }
          System.out.println("\nreverse array :-");
          for (int i : arrayInt) {
              System.out.print(i+" ");
          }
    }
}
