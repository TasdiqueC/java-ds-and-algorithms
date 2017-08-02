package data_structures.doubly_linked_lists;

/**
 * Created by TasdiqueC on 8/1/17.
 */
public class Node {
    public int data;
    public Node next;
    public Node previous;

    public void display() {
        System.out.println("{ " + data + " }");
    }
}
