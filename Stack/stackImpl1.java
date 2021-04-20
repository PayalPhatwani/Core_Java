package Stack;

//Stack implementation using array
class stack {
    private int maxSize;
    private int top;
    private int[] stack;

    stack(int maxSize) {
        this.maxSize = maxSize;
        this.top = -1;
        this.stack = new int[maxSize];
    }

    // check whether stack is full or not
    public boolean stackIsFull() {
        if (top >= (maxSize - 1)) {
            return true;
        } else {
            return false;
        }
    }

    // push operation
    public boolean push(int num) {
        if (stackIsFull()) {
            return false;
        } else {
            stack[++top] = num;
            return true;
        }
    }

    //peek operation
    public int peek(){
        if(top>=0){
            return stack[top];
        }else{
            return Integer.MIN_VALUE;
        }
    }

    //display operation
    public void display(){
        for(int i=top;i>=0;i--){
            System.out.println(stack[i]);
        }
    }

    //checking if stack isEmpty
    public boolean isEmpty(){
        if(top<0){
            return true;
        }
            return false;
    }

    //pop operation
    public int  pop(){
        if(isEmpty()){
            System.out.println("Stack is empty..!!");
            return Integer.MIN_VALUE;
        }else{
            return stack[top--];
        }
    }

}

public class stackImpl1 {

    public static void main(String[] args) {
        stack s = new stack(2);

        s.push(2);
        s.push(3);
        System.out.println(s.peek());
        System.out.println("elements are:-");
        s.display();

        stack s1 = new stack(5);
        s1.push(44);
        s1.push(55);
        s1.push(66);
        s1.push(77);
        System.out.println("elements are:-");
        s1.display();
System.out.println("......"+s1.pop());
s1.pop();
        System.out.println("elements are 2:-");
        s1.display();
    }
}
