package LinkedList;

 class Node {
     String data; //Data to store (could be int, string, Object etc)
     Node next; //Pointer to next node in list

    public Node(String data){
        this.data = data;
    }


    public void setData(String data) {
        this.data = data;
    } 

    public String getData(){
        return this.data;
    }

    public void setNext(Node node){
        this.next = node;
    }

    public Node getNext(){
        return this.next;
    }

}

 class linkedlist {
    private Node head;
    private Node tail;

    public Node getHead(){
        return this.head;
    }

    public Node getTail(){
        return this.tail;
    }


    public void addAtEnd(String data){
        //Creating new Node
        Node node = new Node(data);

        //checking if head is empty
        if(this.head==null){
            //making the node as the head and tail as it is the only element in th list so it will be head and tail both
            this.head = this.tail = node;
        }else{
            //if node is not empty then adding the node at the last
            this.tail.setNext(node);
            //making the new node as tail
            this.tail = node;
        }
    }


    public void addAtFirst(String data) {
        //Creating new Node
        Node node = new Node(data);

        //Checking if head is empty
        if(this.head==null){
            //making the node as the head and tail as it is the only element in th list so it will be head and tail both
            this.head = this.tail = node;
        }else{
            //if node is not empty then the new node will point to head node , So linking the next field in new nod eto head node
            node.setNext(this.head);
            //making the new node as head
            this.head = node;
        }
    }

    public void showLinkedList(){
        //Intializing temp to head node
        Node temp = this.head;
        //Traverse the list and print data of each node
        while(temp!=null){
            System.out.println(temp.getData());
            temp = temp.getNext();
        }
    }

    public Node searchElement(String data){
        //Intializing temp to head node
        Node temp = this.head;
        int index = 0;
        //Traverse the list and print data of each node
        while(temp!=null){
            if(temp.getData().equals(data)){
                System.out.println("element at index = "+index);
            return temp;
            }
            index++;
            temp = temp.getNext();
        }
        
        return null;
    }

    public void addAtDesiredLocation(String nodeBeforeData,String data){
        //creating new node
        Node newNode = new Node(data);
        //checking if the list is empty then make newnode head and tail both
        if(this.head==null){
            this.head = this.tail = newNode;
        }else{
            // finding the element after which newnode has to be inserted
         Node nodeBefore = this.searchElement(nodeBeforeData);
         if(nodeBefore != null){
             //Inserting newNode after nodeBefore
             newNode.setNext(nodeBefore.getNext());
             nodeBefore.setNext(newNode);

             //checking if nodeBefore is tail
             if(nodeBefore == this.tail){
                 this.tail = newNode;
             }
         }else{
             System.out.println("Node not found");
         }
        }

    }

    public void deleteNode(String nodeToBeDelete){
        //checking the list is empty 
        //if yes then printing apropriate message
        if(head==null){
            System.out.println("Linked List is empty");
        }else{
            //Find the node to be deleted
            Node node = this.searchElement(nodeToBeDelete);
            //checking if node found or not 
            if(node == null){
                System.out.println("Node not found");
            }
            //Checking if the node to be deleted is head
            else if(node == head ){
                if(node==tail){
                this.head = this.tail = null;
                }
                else{
                    this.head = node.getNext();
                    node.setNext(null);
                }
            }
            else{
                Node nodeBefore = null;
                Node temp = this.head;
                while(temp != null){
                    if(temp.getNext()==node){
                        nodeBefore = temp;
                        break;
                    }
                    temp = temp.getNext();
                }
                //Removing the node
                nodeBefore.setNext(node.getNext());
                if(node == this.tail){
                    this.tail = nodeBefore;
                    node.setNext(null);
                }
            }
        }
    }
}

public class LinkedListImplementation{
    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.addAtEnd("Venice");
        list.addAtEnd("Paris");
        list.addAtEnd("london");
        list.addAtFirst("Payal");
        System.out.println("Added elements into linked list are :-");
        list.showLinkedList();
       if(list.searchElement("Payal")!=null){
           System.out.println("Element found!");
       }else{
           System.out.println("Element not found");
       }

       list.addAtDesiredLocation("Venice", "Mansiss");
       list.deleteNode("Venice");
       list.showLinkedList();
    }
}

    

