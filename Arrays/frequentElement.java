package Arrays;
//Write a java program to find the most frequent element in an array?
import java.util.HashMap;
import java.util.Map.Entry;

public class frequentElement {

    static void printMostFrequentElement(int[] array) {

        // creating hashmap object with elements as keys and their ocurrences as their
        // values
        HashMap<Integer, Integer> freqCountMap = new HashMap<>();

        for (int i : array) {

            if (freqCountMap.containsKey(i)) {
                freqCountMap.put(i, freqCountMap.get(i) + 1);
            } else {
                freqCountMap.put(i, 1);
            }
        }

        int element = 0;
        int frequency = 1;

        for (Entry<Integer, Integer> entry : freqCountMap.entrySet())
            
        if(entry.getValue()>frequency){
            element = entry.getKey();
            frequency = entry.getValue();
        }

        if(frequency>1){
            System.out.println("Most frequent element of the array is = "+element+" with "+frequency+" frequency");
        }else{
            System.out.println("No frequent element every element is unique!");
        }
    } 
  
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        printMostFrequentElement(array);
    }
}
