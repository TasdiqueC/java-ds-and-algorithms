package data_structures.graphs;

import java.util.ArrayList;

/**
 * Created by TasdiqueC on 8/2/17.
 */
public class DirectedGraph {
    private int vCount;
    private int eCount;

    private ArrayList[] adjacents;

    public DirectedGraph(int vCount) {
        this.vCount = vCount;
        this.eCount = 0;
        adjacents = new ArrayList[vCount];

        for (int i = 0; i < vCount; i++) {
            adjacents[i] = new ArrayList<Integer>();
        }
    }

    public int getvCount(){
        return vCount;
    }

    public int geteCount() {
        return eCount;
    }

    public void addEdge(int src, int dest) {
        adjacents[src].add(dest);
        eCount++;
    }

    public Object[] adj(int src) {
        return adjacents[src].toArray();
    }

}
