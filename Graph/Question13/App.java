package Graph.Question13;

import java.util.Arrays;

public class App {

    private static void dfsUtil(Graph graph, boolean[] visited, int source) {
        visited[source] = true;

        for (int nbr: graph.getAdjList()[source]) {
            if (!visited[nbr])
                dfsUtil(graph, visited, nbr);
        }
    }

    public static int getMotherVertex(Graph graph) {

        boolean[] visited = new boolean[graph.getVertices()];
        int lastVertex = 0; //Either last vertex in dfs would be mother vertex (or one of mother vertex), else no mother vertex exist

        for (int i=0; i<graph.getVertices(); i++) {
            if (!visited[i]) {
                dfsUtil(graph, visited, i);
                lastVertex = i;
            }
        }

        Arrays.fill(visited, false);
        dfsUtil(graph, visited, lastVertex);

        for (boolean flag: visited)
            if (!flag)
                return -1;

        return lastVertex;
    }

    public static void main(String[] args) {

        Graph graph = new Graph(4);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(3,0);
        graph.addEdge(3,1);

        System.out.println(getMotherVertex(graph));
    }
}
