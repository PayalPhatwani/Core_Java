package List;
//iterating elements over list

import java.util.*;
public class listiterate2 {
    public static void main(String[] args) {
        //create list
        List<String> namelist = new ArrayList<String>();
        //adding values into list
        namelist.add("payal");
        namelist.add("yash");
        namelist.add("simmy");
        namelist.add("tanmay");

        // 3. Iterator - 
        //Returns an iterator over the elements in this list in proper sequence.
        System.out.println("\n==============> 3. Iterator Example...");
        Iterator<String> namelistIterator = namelist.iterator();
        while (namelistIterator.hasNext()) {
            System.out.println(namelistIterator.next());
        }

        // 4. ListIterator - 
        //traverse a list of elements in either forward or backward order
        
        System.out.println("\n==============> 4. ListIterator Example...");
        ListIterator<String> namelistIterator2 = namelist.listIterator();
        while (namelistIterator2.hasNext()) {
            System.out.println(namelistIterator2.next());
        }
    }
}