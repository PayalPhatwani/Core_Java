package StringQuestions;
//Remove a given character from String?
public class Question6 {
    public static String removeChar(String s , char class1){
        String removeStr = Character.toString(class1);
        String result = s.replaceAll(removeStr,"");
        return result;
    }
    public static void main(String[] args) {
        String str = "java";
        char chr = 'a';
        System.out.println("result = "+removeChar(str,chr));
    }
}