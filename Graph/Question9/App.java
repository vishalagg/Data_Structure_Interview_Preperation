package Graph.Question9;

public class App {

    public static void dfsUtil(Graph graph, int source, boolean[] visited) {

        visited[source] = true;
        System.out.print(source + "-");

        for (int nbr: graph.getAdjList()[source]) {
            if (!visited[nbr])
                dfsUtil(graph, nbr, visited);
        }
    }

    public static void printComponents(Graph graph) {

        int vertices = graph.getVertices();
        boolean[] visited = new boolean[vertices];

        for (int i=0; i<vertices; i++) {
            if (!visited[i]) {
                dfsUtil(graph, i, visited);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(7);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(3, 4);
        graph.addEdge(5, 3);
        graph.addEdge(5, 6);
        graph.addEdge(3, 6);

        printComponents(graph);
    }
}
