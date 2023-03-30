import org.w3c.dom.Node;

public class LinkList {
    static Node head;

    static class Node{
        int data;
        Node next;

        Node(int fill){
            data = fill;
            next = null;
        }
    }
    public void add(int data){
        Node newNode = new Node(data);
        if(head==null) {head = newNode;return;}

        Node current = head;
        while (current.next != null) current = current.next;
        current.next = newNode;
    }

    void printBefore(){
        Node current = head;
        System.out.print("Before \t: ");
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }

    void printAfter(){
        Node current = head;
        System.out.print("\nAfter \t: ");
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
    }
    public void printList(){
        printBefore();
        sort();
        printAfter();

    }

    public void sort(){
        boolean swapped;
        do {
            swapped = false;
            Node prev = null;
            Node curr = head;
            while (curr.next != null) {
                if (curr.data > curr.next.data) {
                    Node temp = curr.next;
                    curr.next = curr.next.next;
                    temp.next = curr;
                    if (prev == null) {
                        head = temp;
                    } else {
                        prev.next = temp;
                    }
                    prev = temp;
                    swapped = true;
                } else {
                    prev = curr;
                    curr = curr.next;
                }
            }
        } while (swapped);
    }

}