package LinkedList;

class Node1{
    String data;
    Node1 next;

    public Node1(String data){
        this.data = data;
    }

    public void setData(String data){
        this.data = data;
    }

    public String getData(){
        return this.data;
    }

    public void setNext(Node1 node){
        this.next = node;
    }

    public Node1 getNext(){
        return this.next;
    }

}

class LinkedList1{
    Node1 head;
    Node1 tail;

    public void addFirst(String data){
        Node1 newNode = new Node1(data);
        if(this.head == null){
            this.head = this.tail = newNode;
        }else{
            newNode.setNext(this.head);
            this.head = newNode;

        }
    }

    public void display(){
        Node1 temp = this.head;
        while(temp!=null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

}

public class ShiftingLinkedList {
   
    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();
        list.addFirst("payal");
        list.addFirst("Simmy");
        list.addFirst("Mansi");
        list.addFirst("Anushka");
        list.addFirst("Lakshika");
        list.display();
       
       ShiftingLinkedList s = new ShiftingLinkedList();
       s.rightShift(list, 2);
       System.out.println("shifting to right for 1 times");
       list.display();
       s.leftShift(list, 2);
       System.out.println("shifting to left for 1 times");
       list.display();
    }

    public void rightShift(LinkedList1 list, int round){
        while(round>0){
         Node1 tempTail = list.tail;
         Node1 temp = list.head;
         Node1 beforeTail = null ;
         if(list.head==null){
             System.out.println("Linked list is empty");
         }else if(list.head == list.tail){

         }else{
         
            while(temp != null){
                if(temp.getNext()== list.tail){
                    beforeTail = temp;
                    break;
                }
                temp = temp.getNext();
            }

            //neccesaary steps to make right shift
            beforeTail.setNext(null);
            list.tail = beforeTail;
            tempTail.setNext(list.head);
            list.head = tempTail;
            round--;
            }
        }

        
    }

    public void leftShift(LinkedList1 list,int round){
        while(round > 0){
        Node1 tempHead = list.head;
        Node1 afterHead = list.head.getNext();
        //setting after head node as head
        list.head = afterHead;
        //setting tail to the existing head
        list.tail.setNext(tempHead);
        list.tail = tempHead;
        // as tail next must be null
        tempHead.setNext(null);

        round--;
        }
    }
}
