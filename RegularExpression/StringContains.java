package RegularExpression;

import java.util.regex.Pattern;

public class StringContains {
    public static void main(String[] args) {
        String str = "Aa@8";
        String regex = "^(?=.*[a-z])(?=."
        + "*[A-Z])(?=.*\\d)"
        + "(?=.*[-+_!@#$%^&*., ?]).+$";

      boolean matched =  Pattern.matches(regex, str);
      System.out.println(matched);

    }
}
