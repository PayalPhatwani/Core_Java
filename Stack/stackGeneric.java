package Stack;

public class stackGeneric <T> {
    private int maxSize;
    private int top;
    private T[] stack;

    stackGeneric(int maxSize){
        this.maxSize = maxSize;
        this.top = -1;
    }
}
