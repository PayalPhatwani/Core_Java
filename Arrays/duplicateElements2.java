package Arrays;

import java.util.HashSet;

//Brute Force method
public class duplicateElements2 {
    public static void main(String[] args) {
        int array[] = {1,2,3,1,2};
        
        HashSet<Integer> set = new HashSet<>();

        System.out.println("Duplicate elements are:-");
        for(int number : array){
           
            //As set will not allow duplicacy of an element 
            //set.add will return false if the number we try to add cause duplicacy or already present int set
           if(!set.add(number)){
            System.out.println(number);
           }
        }

    }
}