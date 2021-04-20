package RegularExpression;
//Extract numbers from a string
import java.util.*;
import java.util.regex.*;
public class ExtractNumbers {
public static void main(String[] args) {
     
    String str = "payal12345 karan88";
    
    List<Integer> numbers = new LinkedList<>();
    
    //compile method describe the regex
    Pattern p = Pattern.compile("\\d+"); //in java \d means range of (0-9)
       
    //matcher() is used to search on define regex and the matcher obj m 
    // contains information about the search   
    Matcher m = p.matcher(str);

    //find() returns true if the pattern was found in string
    while(m.find()){
        numbers.add(Integer.parseInt(m.group()));
    }

    numbers.forEach(System.out::println);
}
}
