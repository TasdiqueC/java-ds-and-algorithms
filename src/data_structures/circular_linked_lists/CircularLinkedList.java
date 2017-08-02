package data_structures.circular_linked_lists;

/**
 * Created by TasdiqueC on 8/1/17.
 */
public class CircularLinkedList {
    private Node first, last;

    public CircularLinkedList() {
        first = null;
        last = null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {last = newNode;}

        newNode.next = first;
        first = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {first = newNode;}
        else {
            last.next = newNode;
            last = newNode;
        }
    }

    public int deleteFirst() {
        int temp = first.data;

        if (first.next == null) {
            last = null;
        }

        first = first.next;
        return temp;
    }

    public boolean isEmpty() {
        return (first.next == null);
    }

    public void displayList() {
        System.out.println("First ---> Last");
        Node current = first;
        while(current != null) {
            current.display();
            current = current.next;
        }
        System.out.println();
    }
}
