package Collections;
import java.util.HashMap;
public class HashMapmethods1 {
    public static void main(String[] args) {
        HashMap<Character,String> wordBook = new HashMap<>();
         //Adding elements into HashMap
            wordBook.put('a', "Application");
            wordBook.put('b', "Bug");
            wordBook.put('c', "Cloud");
        //get elements by its key
        System.out.println("Get  value with key value a :"+wordBook.get('a'));

        //Know the size of HashMap
        System.out.println("Size of HashMap: "+wordBook.size());

        //removing all the value associated to specified key
        wordBook.remove('a');

        //Removes all of the mappings 
        wordBook.clear();

        //checking if the HashMap is empty or not 
        System.out.println("is HashMap empty: "+wordBook.isEmpty());

    }
}
