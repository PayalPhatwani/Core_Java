package StringQuestions;
//how to remove the duplicate character from String?
import java.util.LinkedHashSet;
import java.util.Set;
public class Question5 {
    public static void main(String[] args) {
        String str = "Java";
        char[] arrstr1 = str.toCharArray();
        //using set because its automatically ignores duplicate characters
        Set<Character> set = new LinkedHashSet<Character>();
        for (char chr : arrstr1) {
            set.add(chr);
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : set) {
            sb.append(character);
        }
        System.out.println("Java after no duplicates = "+sb);
    }
}
