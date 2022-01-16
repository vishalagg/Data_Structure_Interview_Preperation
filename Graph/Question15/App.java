package Graph.Question15;

public class App {

    private static boolean dfsUtil(Graph graph, int source, int destination, boolean[] visited) {

        visited[source] = true;
        boolean hasPath = false;
        if (source == destination) {
            return true;
        }
        for (int nbr: graph.getAdjList()[source])  {
            if (!visited[nbr]) {
                hasPath = hasPath | dfsUtil(graph, nbr, destination, visited);
            }
        }
        return hasPath;
    }

    public static boolean isPathExist(Graph graph, int node1, int node2) {
        boolean[] visited = new boolean[graph.getVertices()];
        boolean[] flag = new boolean[1];
        return dfsUtil(graph, node1, node2, visited);
    }

    public static void main(String[] args) {
        Graph graph1 = new Graph(9);
        graph1.addEdge(0,2);
        graph1.addEdge(0,5);
        graph1.addEdge(2,3);
        graph1.addEdge(2,4);
        graph1.addEdge(5,3);
        graph1.addEdge(5,6);
        graph1.addEdge(3,6);
        graph1.addEdge(6,7);
        graph1.addEdge(6,8);
        graph1.addEdge(6,4);
        graph1.addEdge(7,8);
        System.out.println(isPathExist(graph1, 0, 7));

        Graph graph2 = new Graph(4);
        graph2.addEdge(0,1);
        graph2.addEdge(1,2);
        graph2.addEdge(1,3);
        graph2.addEdge(2,3);

        System.out.println(isPathExist(graph2, 3, 0));

    }
}
