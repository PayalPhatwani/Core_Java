package StringQuestions;

import java.util.Arrays;

//java program to check if string is anagram or not 
public  class anagramString {

    public static String sortArray(String str){
        char [] charArray = str.toCharArray();
        
        Arrays.sort(charArray);

        StringBuilder s = new StringBuilder();
        for (int i =0 ;i<charArray.length;i++){
            s.append(charArray[i]);
        }
    return s.toString();
    }


    public static void main(String[] args) {
        String str = "Silenta";
       String sortArray1 =  sortArray(str.toLowerCase());
        System.out.println(sortArray1);

        String str2 = "Listen";
        String sortArray2 = sortArray(str2.toLowerCase());
        System.out.println(sortArray2);

        if(sortArray1.equals(sortArray2)){
            System.out.println("is anagram");
        }else{
            System.out.println("not anagram");
        }
    }
}
