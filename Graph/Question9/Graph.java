package Graph.Question9;

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

    public List<Integer>[] getAdjList() {
        return adjList;
    }

    public void addEdge(int source, int dest) {
        this.adjList[source].add(dest);
        this.adjList[dest].add(source);
    }

    public int getVertices() {
        return vertices;
    }
}