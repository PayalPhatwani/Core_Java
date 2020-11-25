package CoreJavaCodingProblems;

public class NumbersSwap {

    public int number1, number2;

    NumbersSwap(int a, int b) {
        this.number1 = a;
        this.number2 = b;
    }

    public void swap(NumbersSwap ns) {
        int temp = ns.number1;
        ns.number1 = ns.number2;
        ns.number2 = temp;
    }

    public static void main(String[] args) {
        NumbersSwap n = new NumbersSwap(10, 20);
        System.out.println("before swapping :-\n"+ n.number1+"  " + n.number2);
        n.swap(n);
        System.out.println("after swapping :-\n"+ n.number1+"  " + n.number2);
    }
}