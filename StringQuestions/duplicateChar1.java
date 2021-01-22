package String;
import java.util.*;

public class duplicateChar1 {
    static int CountOccurence(String mainStr,String str){
        String strDemo = mainStr.replaceAll(str,"");
        return mainStr.length() - strDemo.length();
    }

    public static void main(String[] args) {
        String str = "Javav";
        HashSet<Character> duplicates = new HashSet<>();
        System.out.println("Below listed are duplicate characters of given string:-");
        for (int i=0; i<str.length();i++){
            int count = CountOccurence(str, Character.toString(str.charAt(i)));
            if(count ==2){
                duplicates.add(str.charAt(i));
            }
        }

        System.out.println(duplicates);

    }
}
