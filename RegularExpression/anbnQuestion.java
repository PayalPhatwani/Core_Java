package RegularExpression;

import java.util.regex.Pattern;

public class anbnQuestion {
   
    public static void main(String[] args) {

        String str1 = "aaa bbb aa";
        String str2 = "bbaaa";
    
        System.out.println(str1.length());
        String s = str1.replaceAll("b","");
        System.out.println(s.length());

        System.out.println(s);

    }
}
