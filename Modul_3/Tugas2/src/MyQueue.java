public class MyQueue<E> {
    private Node first, last;
    private int size;
    private E data;

    private class Node<E>{
        private E data;
        Node next;
    }

    public MyQueue(){
        first=null;
        last=null;
        size=0;
    }

    public E enqueue(E data){
        Node newNode = last;
        last = new Node();
        last.data = data;
        last.next = null;
        if (isEmpty()){
            first=last;
        } else {
            newNode.next=last;
        }
        size++;
        return data;
    }

    public E dequeue(){
        data = (E) first.data;
        first = first.next;
        if(isEmpty()){
            last=null;
            System.out.println("Tidak ada data di dalam");

        }
        size--;
        return data;
    }

    public E peek(){
        if(isEmpty()){
            throw new IllegalStateException("Tidak ada data");
        }
        return (E) first.data;
    }

    public boolean isEmpty(){
        return (size==0);
    }

    public int size(){
        return size;
    }
}
