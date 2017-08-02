package data_structures.graphs;

/**
 * Created by TasdiqueC on 8/2/17.
 */
public class App {
    public static void main(String [] args) {
        DirectedGraph myGraph = new DirectedGraph(5);
        myGraph.addEdge(0, 1);
        myGraph.addEdge(0, 2);
        myGraph.addEdge(0, 3);
        myGraph.addEdge(1, 2);
        myGraph.addEdge(1, 4);
        myGraph.addEdge(2, 3);
        myGraph.addEdge(3, 1);
        myGraph.addEdge(4, 0);
        myGraph.addEdge(4, 3);

        Object[] values = myGraph.adj(1);
        for(Object val: values) {
            System.out.println(val);
        }
    }
}
