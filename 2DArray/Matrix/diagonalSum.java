package Matrix;

public class diagonalSum extends helperClass{

    public static void main(String[] args) {
        int [][] array2D = get2dArray();

        int leftSum =0;
        int rightSum =0;

        for(int i=0;i<array2D.length;i++){
            for(int j=0;j<array2D.length;j++){
                if(i==j){
                    leftSum+=array2D[i][j];
                }
                if(i+j==array2D.length-1){
                    rightSum += array2D[i][j];
                }
            }
        }
        System.out.println("Left diagonal sum is = "+leftSum);
        System.out.println("Right diagonal sum is = "+rightSum);
    }
}
