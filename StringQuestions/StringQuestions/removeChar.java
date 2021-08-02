package StringQuestions;
//remove a given character from String
public class removeChar {
    
    public static void main(String[] args) {
        String str = "java";
        char removeChar = 'a';
        String resultString = str.replaceAll(Character.toString(removeChar), "");
        System.out.println("Result = "+resultString);
    }
}
