package data_structures.queue;

/**
 * Created by TasdiqueC on 8/1/17.
 */
public class Queue {
    private int maxSize;
    private long[] queueArray;
    private int front; // index at front
    private int rear; // index at back
    private int nItems; // number of items/people in our current queue

    public Queue (int size) {
        this.maxSize = size;
        this.queueArray = new long[size];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public void insert(long j) {
        if (!isFull()) {
            rear++;
            queueArray[rear] = j;
            nItems++;
        }
        // else sout(isFull string);
    }

    public boolean isFull () {
        if (nItems == maxSize) {
            System.out.println("Queue is full. Please remove.");
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (nItems == 0) {
            System.out.println("Queue is empty... Please add.");
            return true;
        }
        else {
            return false;
        }
    }

    public void view() {
        System.out.print("[ ");
        for (int i = 0; i < nItems; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.print("]");
    }

    public long remove() {
        if (!isEmpty()) {
            long oldFront = queueArray[front];
            for (int i = front; i < rear; i++) {
                queueArray[i] = queueArray[i+1];
            }
            rear--;
            nItems--;
            return oldFront;
        }
        else {
            return -1;
        }
    }

    public long peekFront() {
        return queueArray[front];
    }
}
