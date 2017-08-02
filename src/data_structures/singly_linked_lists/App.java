package data_structures.singly_linked_lists;

/**
 * Created by TasdiqueC on 8/1/17.
 */
public class App {
    public static void main(String args[]) {
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.insertFirst(23);
        myList.insertFirst(12);
        myList.insertFirst(12);
        myList.displayList();
        myList.deleteFirst();
        myList.displayList();

        myList.insertLast(40);
        myList.displayList();
    }
}
