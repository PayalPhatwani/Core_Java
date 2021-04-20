package SearchingAlgo;
//
public class binarySearch {
    static int searching(int[] arr,int num){
        int length = arr.length;
        //as the array is sorted
        //the last element would be the max
        int max = arr[length-1];
        int min = arr[0];
        // if(num > max){
        //     System.out.println("The number is not found in array.");
        //     return -1;
        // }else if(num<min){
        //     System.out.println("The number is not found in array.");
        //     return -1;
        // }
        int low = 0;
        int high = length-1;
        boolean loop = true;
        while(low<=high){
           int mid =(int)Math.floor(low+high/2);
           if(arr[mid]==num){
               loop=false;
               return mid;
           }else if(arr[mid]>num){
               high = mid-1;
           }else if(arr[mid]<num){
               low = mid+1;
           }

        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        System.out.println(searching(arr, 0));
    }
}
