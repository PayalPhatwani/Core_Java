package StringQuestions;
//Calculate count of number of vowels and consonants in a given string
public class Question3 {
    public static void main(String[] args) {
        String str = "JavA";
        long vowelNo = str.chars().filter(t -> t == 'a' || t == 'A' ||
                                               t == 'e' || t == 'E' ||
                                               t == 'i' || t == 'I' ||
                                               t == 'o' || t == 'O' || 
                                               t == 'u' || t == 'U').count();
       
        int consonentNo = str.length() - (int) vowelNo;

        System.out.println("No. of vowel = " + vowelNo);
        System.out.println("No. of consonents = " + consonentNo);

    }
}