class Node{
    String data;
    Node left, right;

    public Node(String d){
        data = d;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    String space = " ";

    BinaryTree(){
        root=null;
    }

    void insert(String data){
        root = insertNode(root, data);
    }
    Node insertNode(Node root, String data){
        if(root==null){
            root = new Node(data);
            return root;
        }
        if (data.compareTo(root.data)<0){
            root.left = insertNode(root.left, data);
        } else if (data.compareTo(root.data)>0){
            root.right = insertNode(root.right, data);
        }
        return root;
    }

    void printTree(){
        printTree(root, space);
    }

    void printTree(Node root, String space){
        if(root != null){
            System.out.println(space+ root.data);
            printTree(root.left, space+" ");
            printTree(root.right, space+" ");
        }
    }

    void preOrder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    void postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

}
