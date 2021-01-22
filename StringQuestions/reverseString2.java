package String;
/**
 * reverse a given string 
 */
public class reverseString2 {

    static void reverse(String str){
        if(str.isEmpty() || str == null){
            ; //does nothing
        }else{
            //converting string to char array
        char[] strArr = str.toCharArray();
            for(int i=0 ;i< strArr.length/2 ;i++){
                char temp = strArr[i];
                strArr[i] = strArr[strArr.length - 1 - i];
                strArr[strArr.length - 1 - i] = temp;
            }

            StringBuilder sb = new StringBuilder();

            //converting char array to string 
            for (char ch: strArr) {
                sb.append(ch);
            }
     
             str = sb.toString();
             System.out.println("reverse String = >"+str);
        }
    }
    public static void main(String[] args) {
        String str = "payal";
        System.out.println("Original String = > "+str);
        reverse(str);
    }

         //Cpu time = 0.12 sec

}
