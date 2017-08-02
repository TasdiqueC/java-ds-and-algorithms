package data_structures.linked_lists;

/**
 * Created by TasdiqueC on 8/1/17.
 */
public class App {
    public static void main(String args[]){
        Node nodeA = new Node();
        nodeA.data = 3;

        Node nodeB = new Node();
        nodeB.data = 4;
        nodeA.next = nodeB;

        Node nodeC = new Node();
        nodeC.data = 7;
        nodeB.next = nodeC;

        Node nodeD = new Node();
        nodeD.data = 8;
        nodeC.next = nodeD;

        System.out.println(listLength(nodeA));
        System.out.println(listLength(nodeB));
    }

    public static int listLength(Node aNode) {
        int counter = 0;
        while(aNode != null) {
            aNode = aNode.next;
            counter++;
        }
        return counter;
    }
}
