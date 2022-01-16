package Graph.Question8;

import java.util.Arrays;
import java.util.List;

public class App {

    public static Graph transposedGraph(Graph graph) {

        List<Integer>[] adjList = graph.getAdjList();
        int vertices = graph.getVertices();
        Graph transposedGraph = new Graph(vertices);

        for (int i=0; i<vertices; i++) {
            for (int j: adjList[i]) {
                transposedGraph.addEdge(j, i);
            }
        }
        return transposedGraph;
    }

    private static void dfsUtil(Graph graph, boolean[] visited, int source) {

        visited[source] = true;

        List<Integer>[] adjList = graph.getAdjList();
        int vertices = graph.getVertices();

        for (Integer nbr: adjList[source]) {
            if (!visited[nbr])
                dfsUtil(graph, visited, nbr);
        }
    }

    public static boolean isStronglyConnected(Graph graph) {

        int vertices = graph.getVertices();

        boolean[] visited = new boolean[vertices];
        dfsUtil(graph, visited, 0);

        for (boolean visit: visited) {
            if (!visit)
                return false;
        }

        Arrays.fill(visited, false);
        dfsUtil(transposedGraph(graph), visited, 0);
        for (boolean visit: visited) {
            if (!visit)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Graph graph1 = new Graph(5);
        graph1.addEdge(0, 1);
        graph1.addEdge(1, 2);
        graph1.addEdge(2, 3);
        graph1.addEdge(3, 0);
        graph1.addEdge(2, 4);
        graph1.addEdge(4, 2);

        System.out.println(isStronglyConnected(graph1));

        Graph graph2 = new Graph(4);
        graph2.addEdge(0, 1);
        graph2.addEdge(1, 2);
        graph2.addEdge(2, 3);

        System.out.println(isStronglyConnected(graph2));
    }
}
