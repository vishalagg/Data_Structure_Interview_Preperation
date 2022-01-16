package Graph.Question7;

import java.util.LinkedList;
import java.util.List;

public class Graph {

    private int vertices;
    private List<Integer>[] adjList;

    Graph(int vertices) {
        this.vertices = vertices;
        this.adjList = new LinkedList[vertices];

        for (int i=0; i<vertices; i++) {
            this.adjList[i] = new LinkedList<>();
        }
    }

    public void print() {
        for (int v = 0; v < this.vertices; v++) {
            System.out.print(v);
            for (Integer u: this.adjList[v]) {
                System.out.print("->" + u);
            }
            System.out.print("\n");
        }
    }

    public int getVertices() {
        return vertices;
    }

    public List<Integer>[] getAdjList() {
        return adjList;
    }

    public void addEdge(int source, int dest) {
        this.adjList[source].add(dest);
    }
}

