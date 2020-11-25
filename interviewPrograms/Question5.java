//Write a program to reverse a string using recursive algorithm.
package interviewPrograms;
public class Question5 {
    String reverseStr="";
    public String reverse(String str){
        if(str.length()==1){
            return str;
        }else{
            reverseStr += str.charAt(str.length()-1) 
            + reverse(str.substring(0,str.length()-1 ));
            return reverseStr;
        }
    }

    public static void main(String[] args) {
        Question5 q = new Question5();
        System.out.println("Reverse String = "+q.reverse("JAVA"));
    }
}
