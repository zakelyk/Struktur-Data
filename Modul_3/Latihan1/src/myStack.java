import java.io.ObjectStreamException;
import java.sql.Array;
import java.util.ArrayList;

public class myStack{
    private int maxSize;
    private Object[] stackArray;
    private int top;
    public int index = 0;

    public myStack(int maxSize) {
        stackArray = new Object[maxSize];
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
