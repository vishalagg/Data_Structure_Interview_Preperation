package Graph.Question6;

import java.util.List;

public class App {

    public static Graph getTranspose(Graph graph) {

        List<Integer>[] adjList = graph.getAdjList();
        int vertices = graph.getVertices();

        Graph transposedGraph = new Graph(vertices);

        for (int i=0; i<vertices; i++) {
            for (int j=0; j<adjList[i].size(); j++) {
                transposedGraph.addEdge(adjList[i].get(j), i);
            }
        }

        return transposedGraph;
    }

    public static void main(String[] args) {

        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);

        Graph transposedGraph = getTranspose(graph);
        graph.print();
        System.out.println("--------------------");
        transposedGraph.print();
    }
}
