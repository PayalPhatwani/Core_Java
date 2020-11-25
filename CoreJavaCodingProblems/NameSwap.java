package CoreJavaCodingProblems;

public class NameSwap {

    public String FirstName, LastName;

    NameSwap(String a, String b) {
        this.FirstName = a;
        this.LastName = b;
    }

    public void swap(NameSwap ns) {
        String temp = ns.FirstName;
        ns.FirstName = ns.LastName;
        ns.LastName = temp;
    }

    public static void main(String[] args) {
        NameSwap n = new NameSwap("Raj", "Kapoor");
        System.out.println("before swapping :-\n"+ n.FirstName+"  " + n.LastName);
        n.swap(n);
        System.out.println("after swapping :-\n"+ n.FirstName+"  " + n.LastName);
    }
}