package Matrix;
public class interchangeDiagonal extends helperClass {
    public static void main(String[] args) {
       int [][] arr2d =  get2dArray();
       int i=0,j=0;
       for( i=0;i<arr2d.length;i++){
        int temp  = arr2d[i][i];
        arr2d[i][i]  = arr2d[i][arr2d.length-1 -i];   
        arr2d[i][arr2d.length-1 -i] = temp;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
       } 

       print2dArray(arr2d, arr2d.length, arr2d.length);
       System.out.println("Displaying interchanged 2 D array");

       for( i=0;i<arr2d.length;i++){
           for( j=0;j<arr2d.length;j++){
               System.out.print(arr2d[i][j]+" ");
           }
           System.out.println();
       }

       print2dArray(arr2d, arr2d.length, arr2d.length);
    }
}
