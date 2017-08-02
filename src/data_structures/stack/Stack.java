package data_structures.stack;

/**
 * Created by TasdiqueC on 7/31/17.
 */
public class Stack {
    private int maxSize;
    private long[] stackArray;
    private int top;

    public Stack (int size) {
        maxSize = size;
        this.stackArray = new long[size];
        this.top = -1;
    }

    public void push(long j) {
        if (!isFull()) {
            top++;
            stackArray[top] = j;
        }
        else {
            System.out.println("Unable to push any further... Please pop!");
        }
    }

    public long pop() {
        if (!isEmpty()) {
            int oldTop = top;
            top--;
            return stackArray[oldTop];
        }
        else {
            System.out.println("The stack is empty. Cannot pop! Please push!");
            return -1;
        }
    }

    public long peak() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return ((maxSize-1) == top);
    }
}
