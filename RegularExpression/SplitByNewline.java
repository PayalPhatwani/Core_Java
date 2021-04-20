package RegularExpression;

public class SplitByNewline {
    public static void main(String[] args) {
        String r = "payal";
        String p = "phatwani";
        String s = r+ "\n" + p;
        System.out.println(s);
        String str [] = s.split("\\n");

        System.out.println(str[1]);
    }
}
