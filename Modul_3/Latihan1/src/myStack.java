import java.io.ObjectInput;
import java.sql.Array;

public class myStack{
    private int maxSize;
    private Object[] stackArray;
    private int top;
    public int index = 0;

    public myStack() {
        stackArray = new Object[99999];
        top = -1;
    }
    public void push(Object item) {
        stackArray[++top] = item;
    }

    public Object pop() {
        return (Object) stackArray[top--];
    }

    public Object peek() {
        return (Object) stackArray[top];
    }


    public boolean empty() {
        return top == -1;
    }




    public int search(Object item) {
        int index = top;
        while (index >= 0) {
            if (stackArray[index].equals(item)) {
                return top - index + 1;
            }
            index--;
        }
        return -1;
    }
}
