package Graph.Question11;

public class App {

    private static boolean isBipartiteHelper(Graph graph, int source, boolean[] visited, boolean[] color) {

        visited[source] = true;

        for (int nbr: graph.getAdjList()[source]) {

            if (!visited[nbr]) {
                color[nbr] = !color[source];

                if (!isBipartiteHelper(graph, nbr, visited, color))
                    return false;
            } else if (color[source] == color[nbr]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isBipartite(Graph graph) {

        boolean[] visited = new boolean[graph.getVertices()];
        boolean[] color = new boolean[graph.getVertices()];
        color[0] = false;
        return isBipartiteHelper(graph, 0, visited, color);
    }

    public static void main(String[] args) {
        Graph graph1 = new Graph(7);
        graph1.addEdge(0, 1);
        graph1.addEdge(1, 2);
        graph1.addEdge(2, 3);
        graph1.addEdge(3, 4);
        graph1.addEdge(4, 5);
        graph1.addEdge(5, 0);
        System.out.println(isBipartite(graph1));

        Graph graph2 = new Graph(7);
        graph2.addEdge(2, 1);
        graph2.addEdge(0, 3);
        graph2.addEdge(1, 0);
        graph2.addEdge(4, 2);
        graph2.addEdge(5, 1);
        graph2.addEdge(2, 0);
        System.out.println(isBipartite(graph2));
    }
}
