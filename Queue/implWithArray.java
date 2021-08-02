package Queue;

public class implWithArray {
  private int front;
  private int rear;
  private int maxSize;
  private String arr[];
  
  implWithArray(int maxSize){
    this.front= 0;
    this.rear= -1;
    this.maxSize=maxSize;
    this.arr = new String[maxSize];
  }

  //checking if queue is full or not 
  public boolean isFull(){
      if(this.rear== this.maxSize-1){
          System.out.println("queue is full");
          return true;
      }
      return false;
  }

  //Adding an element at the rear end of the queue
  public void enqueue 
  (int num){
        if(!isFull()){
            this.arr[++this.rear] = num;
        }

  }

  public static void main(String[] args) {
      System.out.println();
  }
}
