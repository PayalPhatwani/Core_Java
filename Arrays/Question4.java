package Arrays;
//Move all zeroes to end of array
public class Question4 {
private static void zeroesShiftToEnd(int[] arrayInteger, int arrayLength) {
    int index=0;
    for(int i=0;i<arrayLength;i++){
        if(arrayInteger[i]!=0){
            arrayInteger[index++]=arrayInteger[i];
        }
    }
        while(index<arrayLength){
            arrayInteger[index++]=0;
        }
    }
    public static void main(String[] args) {
        int [] arrayInteger = {2,0,3,0,4,6,0,4,5,0};
        int arrayLength = arrayInteger.length;
        System.out.println("\n Orginal Array");
        for (int i : arrayInteger) {
            System.out.print(i+" ");
        }
        zeroesShiftToEnd(arrayInteger,arrayLength);

         System.out.println("\nAfter Shifting zeroes to End, Array:-");
        for (int i : arrayInteger) {
            System.out.print(i+" ");
        }
    }	
}
