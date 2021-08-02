import java.util.Scanner;

/**
 * tree
 */
/**
 * tree
 */
public class tree {

    static Scanner sc = new Scanner(System.in);
    public static Node createTree(){
        Node root = null;

        System.out.println("Enter data:");
        int data = sc.nextInt();
        if(data==-1)return null;

       root = new Node(data);

       System.out.println("Enter data for "+data+" left");
       root.left = createTree();

       System.out.println("Enter data for "+data+" right");
       root.right = createTree();
        return root;
    }

    public static void inorder(Node root){
        if(root==null) return;

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void postorder(Node root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }


    public static void main(String[] args) {
        Node root = createTree();
        System.out.println("In order:- \n");
        inorder(root);
        System.out.println("Post order:- \n");
        postorder(root);
        System.out.println("Pre order:- \n");
        preorder(root);
    }
    
}

class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data=data;
    }
}