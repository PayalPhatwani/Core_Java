package String;

public class countVowels {

    public static int countvowels(String str){
        int count = 0;

        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        String str = "payal";
        int countOfVowel = countvowels(str);
        int countOfConsonants = str.length() - countOfVowel;
        System.out.println("Number of vowels are = >" +countOfVowel+"\nNumber of consonants are = >"+countOfConsonants);
    }
}
