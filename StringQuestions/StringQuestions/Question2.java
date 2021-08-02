package StringQuestions;

//how-to-reverse-a-string-using-lambda-expression
interface StringFunc {
   String func(String n);
}
public class Question2 {
    public static void main(String[] args) {
        StringFunc p =(name)->{
            String reverseString="";
            for(int i=name.length()-1;i>=0;i--){
                reverseString += name.charAt(i);
            }
            return reverseString;
        };
        System.out.println("reverse of React = "+p.func("React"));
    }
}
