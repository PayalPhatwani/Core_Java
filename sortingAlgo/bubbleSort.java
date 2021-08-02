

public class bubbleSort {
    void bubble(int arr[]) 
    { 
        int n = arr.length;    
        for (int i = 0; i < n-1; i++)
        { 
           boolean go = false;
            for (int j = 0; j < n-i-1; j++) 
            {
                if (arr[j] > arr[j+1]) 
                { 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                    go = true;
                }
            }
            if(!go){
                break;
            } 
        }
    } 

    public static void main(String[] args) {
        bubbleSort bs = new bubbleSort();
        int[] unsortedArray = {1,3,2,9,5};
        bs.bubble(unsortedArray);

        for (int i : unsortedArray) {
            System.out.println(i);
        }
    }
}
