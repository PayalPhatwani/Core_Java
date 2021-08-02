import java.util.Scanner;

public class printString2 {

    public static String print(String s,int start){
        if(start==s.length()){
            System.out.println(s);
            return "";
        }
        for(int i=0;i<s.length() && i+start<=s.length();i++){
            System.out.println(s.substring(i,i+start));
        }

        return print(s, start+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        print(s,1);
        sc.close();
    }
}
