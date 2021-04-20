package Collections;
import java.util.LinkedList;

//Implementation of Queue using LinkedList
public class QueueImpl {
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();

        // adding elements in queue as addition always takes place from the last in queue
        queue.addLast(1);
        queue.addLast(2);
        queue.addLast(3);
        queue.addLast(4);
        queue.addLast(5);

        System.out.println("Queue contains elements stated below:-");
        for (Integer integer : queue) {
            System.out.println(integer);
        }

        //deleting elements from queue
        //As deletion in queue done from the first
        // we can use pollFirst method of linkedList
        System.out.println("pooping elements....");
        while(!queue.isEmpty()){
         System.out.println(queue.pollFirst()+" ");
        }
    }
}
