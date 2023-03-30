import org.w3c.dom.Node;

public class LinkList {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){

            next = null;
        }

        public void add(int data){
            Node newNode = new Node(data);
        }
    }
}