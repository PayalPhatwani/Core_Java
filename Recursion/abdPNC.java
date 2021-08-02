import java.util.Scanner;

public class abdPNC {
    
    public static void calPNC(String s,int index){
        if(index>=s.length())return;
        StringBuilder sb = new StringBuilder(s);
        char c = sb.charAt(index);
        sb.deleteCharAt(index);
        for(int i=0;i<s.length();i++){
           sb.insert(i, c);
           System.out.println(sb);
           sb.deleteCharAt(i);
        }

        calPNC(s, index+1);
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        calPNC(s,0);
        sc.close();
    }
}
