package Arrays;
//Find the smallest and second smallest elements in an array
public class Question6 {
    private static void sortArray(int[] arrayInt) {
        //sorting Array by bubble sort in ascending order
        for(int i=0;i<arrayInt.length-1;i++){
            for(int j=0;j<arrayInt.length-1;j++){
                if(arrayInt[j+1]<arrayInt[j]){
                    int temp = arrayInt[j+1];
                    arrayInt[j+1]=arrayInt[j];
                    arrayInt[j]=temp;
                }
            }
        }
	}
    public static void main(String[] args) {
        int[] arrayInt = {3,4,8,2,9,5};
        System.out.println("Array is :-");
        for (int i : arrayInt) {
            System.out.print(i+" ");
        }
        sortArray(arrayInt); 
    System.out.println("\nsmallest element is ="+arrayInt[0]);
    System.out.println("second smallest element is = "+arrayInt[1]);
	}
}
