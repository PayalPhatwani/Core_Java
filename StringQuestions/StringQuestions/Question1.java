package StringQuestions;
//How to Count Occurrences of a Character in String
public class Question1 {
    public static int Count(String str,char chr){
        
      return (int)str.chars().filter(ch -> ch==chr).count();
      // chars() method convert a String to a Stream of single characters.
      // filter() method then takes each character and checks the condition if its true,
      //then that character is selected otherwise, it will be ignored
      //count() method counts the matches , matched by filter() method
    }
    public static void main(String[] args) {
        String str = "Java";
        char chr = 'a';
        System.out.println("Occurence of "+chr+" is ="+Count(str, chr));
    }
}
