package Graph.Question10;

import java.util.List;

public class App {

    private static void dfsUtil(Graph graph, int i, boolean[] visited) {
        visited[i] = true;

        for (int nbr: graph.getAdjList()[i]) {
            if (!visited[nbr])
                dfsUtil(graph, nbr, visited);
        }
    }

    public static boolean willCreateSeparateComponent(Graph graph, int node1, int node2) {

        List<Integer>[] adjList = graph.getAdjList();
        adjList[node1].remove(adjList[node1].indexOf(node2));
        adjList[node2].remove(adjList[node2].indexOf(node1));

        int vertices = graph.getVertices();
        boolean[] visited = new boolean[vertices];
        dfsUtil(graph, 0, visited);

        for (boolean flag: visited) {
            if (!flag)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(0, 4);

        graph.print();
        System.out.println(willCreateSeparateComponent(graph, 3, 4));
        System.out.println(willCreateSeparateComponent(graph, 1, 2));
    }
}
