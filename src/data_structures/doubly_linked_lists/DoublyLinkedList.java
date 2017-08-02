package data_structures.doubly_linked_lists;

/**
 * Created by TasdiqueC on 8/1/17.
 */
public class DoublyLinkedList {
    private Node first;
    private Node last;

    public DoublyLinkedList() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return first.next == null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {last = newNode;}
        else {first.previous = newNode;}

        newNode.next = first;
        this.first = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {first = newNode;}
        else {
            last.next = newNode;
            newNode.previous = last;
        }

        this.last = newNode;
    }

    public Node deleteFirst() {
        Node temp = first;
        if(first.next == null) {
            last = null; // there is no last, one item in the list
        }
        else {
            first.next.previous = null; // the list's new first node will point to null
        }

        first = first.next;
        return temp;
    }

    public Node deleteLast() {
        Node temp = last;
        if(first.next == null) {
            first = null;
        }
        else {
            last.previous.next = null; // the list's new first node will point to null
        }

        last = last.previous;
        return temp;
    }

    public boolean insertAfter(int key, int data) {
        Node current = first;
        while (current.data != key) {
            current = current.next;
        }
        if (current == null) { // if we can't find the key, there is no point to put this new data
            return false;
        }

        Node newNode = new Node();
        newNode.data = data;

        if (current == last) {
            current.next = newNode;
            newNode.previous = current;
            last = newNode;
        }
        else {
            newNode.next = current.next;
            current.next.previous = newNode;
            current.next = newNode;
            newNode.previous = current;
        }
        return true;
    }

    // assume non-empty
    public Node deleteKey(int key) {
        Node current = first;
        while (current.data != key) {
            current = current.next;
            if (current == null) {return null;}
        }
        if (current == first) {
            deleteFirst();
            return current;
        }
        else if (current == last) {
            deleteLast();
            return current;
        }
        else {
            current.previous.next = current.next;
            current.next.previous = current.previous;
            return current;
        }
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
