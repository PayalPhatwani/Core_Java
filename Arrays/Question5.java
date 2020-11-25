package Arrays;
//Split the array and add the first part to the end
public class Question5 {
    public static void main(String[] args) {
        int [] arrayInt = {3,4,7,8,2,9};
        int index = 3;
        int count=0;
        int [] temp = new int[arrayInt.length];
        System.out.println("Before splitting array:-");
        for (int i : arrayInt) {
            System.out.print(i+" ");
            }
        for(int i=index;i<arrayInt.length;i++){
            temp[count++]=arrayInt[i];
        }
        for(int j=0;j<index;j++){
            temp[count++]=arrayInt[j];
        }
        System.out.println("\nAfter splitting array:-");
        for (int i : temp) {
            System.out.print(i+" ");
        }
    }
}
