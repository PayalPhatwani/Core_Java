import java.util.Scanner;

public class lengthOfString {
    static int count=0;
    public static int calculateLength(String s){
        if(s.equals(""))return 0;

        return 1 + calculateLength(s.substring(1));
          
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(calculateLength(s));
        sc.close();
    }
}
