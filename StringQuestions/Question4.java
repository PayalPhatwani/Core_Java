package StringQuestions;
import java.util.Arrays;
//Check whether two strings are anagram of each other
public class Question4 {
    public static boolean anagramOrNot(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }else{
        char arrstr1[] = str1.toLowerCase().toCharArray();
        char arrstr2[] = str2.toLowerCase().toCharArray();
        Arrays.sort(arrstr1);
        Arrays.sort(arrstr2);
        for(int i=0;i<str1.length();i++){
            if(arrstr1[i]!=arrstr2[i]){
                return false;
            }
        }
        return true;
        }
    }
    public static void main(String[] args) {
        String str1 = "Listea";
        String str2 = "Silent";     
       if(anagramOrNot(str1, str2)){
           System.out.println(str1+" and "+str2+" strings are anagram of each other");
       }else{
           System.out.println(str1+" and "+str2+" strings are not anagram of each other");
       }     
    }
}
