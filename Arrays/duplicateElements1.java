
//Brute Force method
public class duplicateElements1 {
    public static void main(String[] args) {
        int array[] = {1,2,3,1,2};
        int duplicateNumbers[] = new int[array.length/2];
        int index = 0;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j] && i!=j){
                    duplicateNumbers[index]=array[i];
                    index++;
                }
            }
        }

        //printing duplicate elements in the array 
        System.out.println("duplicate Elements are :-");
        for(int i=0;i<duplicateNumbers.length;i++){
            System.out.println(duplicateNumbers[i]);
        }
    }
}