package RegularExpression;

import java.util.regex.Pattern;



public class first {
    public static void main(String[] args) {
        System.out.println("helloo");

        Pattern p = Pattern.compile("^hello good morning payal$"); //declare regular expression here 

        boolean matches = p.matcher("hello \\w \\w payal").matches();

        System.out.println("pattern matches or not => "+matches);
    }
}

