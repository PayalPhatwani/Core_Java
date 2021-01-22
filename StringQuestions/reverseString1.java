package String;

/**
 * reverse a given string 
 */
public class reverseString1 {

     public static void main(String[] args) {
       
        String str = "payal";
        String revStr = "";  

        for(int i=str.length()-1;i>=0;i--){
            revStr += str.charAt(i);
        }

        System.out.println(revStr);
     }

     //Cpu time = 0.24 sec
}