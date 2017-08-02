package data_structures.singly_linked_lists;

/**
 * Created by TasdiqueC on 8/1/17.
 */
public class SinglyLinkedList {
    private Node first;

    public SinglyLinkedList() {

    }

    public boolean isEmpty() {
        return (first.next == null);
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    public void insertLast(int data) {
        Node current = first;
        while (current.next != null) {
            current = current.next;
        }

        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }

    public Node deleteFirst() {
        Node temp = first;
        first = first.next;
        return temp;
    }

//    public Node deleteLast() {
//        Node current = first;
//        while (current.next != null) {
//            current = current.next;
//        }
//    }

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
