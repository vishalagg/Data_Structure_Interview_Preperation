package Graph.Question12;

import java.util.List;
import java.util.Stack;

public class App {

    private static void dfsUtil(Graph graph, int source, boolean[] visited, Stack<Integer> stack) {

        visited[source] = true;

        for (int nbr: graph.getAdjList()[source]) {
            if (!visited[nbr])
                dfsUtil(graph, nbr, visited, stack);
        }
        stack.push(source);
    }

    public static void topologicalSort(Graph graph) {
        List<Integer>[] adjList = graph.getAdjList();
        int vertices = graph.getVertices();

        Stack<Integer> stack = new Stack<>();

        boolean[] visited = new boolean[vertices];

        for (int i=0; i<vertices; i++) {
            if (!visited[i])
                dfsUtil(graph, i, visited, stack);
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + "-");
        }
    }

    public static void main(String[] args) {

        Graph graph1 = new Graph(6);
        graph1.addEdge(5, 0);
        graph1.addEdge(5, 2);
        graph1.addEdge(4, 2);
        graph1.addEdge(4, 1);
        graph1.addEdge(2, 3);
        graph1.addEdge(3, 1);

        topologicalSort(graph1);
        System.out.println();

        Graph graph2 = new Graph(5);
        graph2.addEdge(0, 1);
        graph2.addEdge(1, 2);
        graph2.addEdge(2, 3);
        graph2.addEdge(2, 4);
        graph2.addEdge(3, 4);
        graph2.addEdge(0, 3);
        topologicalSort(graph2);
    }
}
