package Arrays;
public class Question8 {
    public static void main(String[] args) {
        int [] a = new int[5];
        int [] b = new int [200];
        System.out.println("a length = "+a.length+" b length= "+b.length);
        
        a=b;
        
        System.out.println("After assigning a to b");
        System.out.println("a length = "+a.length+" b length= "+b.length);

    }
}
