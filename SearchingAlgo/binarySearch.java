package SearchingAlgo;
//
public class binarySearch {
    static int searching(int[] arr,int num){
        int length = arr.length;
        //as the array is sorted
        //the last element would be the max
        int max = arr[length-1];
        int min = arr[0];
        //checking if number is present or not
        if(num > max || num<min){
            System.out.println("The number is not found in array.");
            //returning -1 as number is not present
            return -1;
        }
        //there is two pointer one is low and other is high 
        //low pointing to first element and high to last
        int low = 0;
        int high = length-1;
        //when low is greater than high it means the two 
        //pointer crosses hence every element has been traversed and   
        while(low<=high){
           int mid =(int)Math.floor(low+high/2);

           if(arr[mid]==num){
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
