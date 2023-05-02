
public class myStack{
    private int maxSize;
    private Object[] stackArray;
    private int top;
    public int index = 0;

    public myStack() {
        stackArray = new Object[9999];
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

}
