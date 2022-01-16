package Graph.Question7;

import java.util.List;
import java.util.Stack;

public class App {

    private static int pathCountRecHelper(Graph graph, int source, int dest, int pathCount) {
        if (source == dest) {
            pathCount++;
        } else {
            for (int i=0; i<graph.getAdjList()[source].size(); i++) {
                pathCount = pathCountRecHelper(graph, graph.getAdjList()[source].get(i), dest, pathCount);
            }
        }
        return pathCount;
    }

    public static int pathCountRecursive(Graph graph, int source, int dest) {
        return pathCountRecHelper(graph, source, dest, 0);
    }

    public static int pathCount(Graph graph, int source, int dest) {

        List<Integer>[] adjList = graph.getAdjList();
        Stack<Integer> stack = new Stack<>();

        int pathCount = 0;

        stack.push(source);

        while (!stack.isEmpty()) {
            source = stack.pop();

            if (source == dest)
                pathCount++;
            else {
                for (int i: adjList[source])
                    stack.push(i);
            }
        }
        return pathCount;
    }

    public static void main(String[] args) {

        //Given graph is acyclic
        Graph graph1 = new Graph(6);
        graph1.addEdge(0, 1);
        graph1.addEdge(0, 2);
        graph1.addEdge(1, 2);
        graph1.addEdge(1, 3);
        graph1.addEdge(3, 4);
        graph1.addEdge(2, 3);
        graph1.addEdge(4, 5);

        assert pathCountRecursive(graph1, 0, 5) == pathCount(graph1, 0, 5);
        System.out.println(pathCount(graph1, 0, 5));
        Graph graph2 = new Graph(7);
        graph2.addEdge(0, 1);
        graph2.addEdge(1, 2);
        graph2.addEdge(1, 5);
        graph2.addEdge(2, 3);
        graph2.addEdge(2, 4);
        graph2.addEdge(5, 3);
        graph2.addEdge(5, 6);
        graph2.addEdge(3, 6);

        assert pathCountRecursive(graph2, 0, 3) == pathCount(graph2, 0, 3);
        System.out.println(pathCountRecursive(graph2, 0, 3));

    }
}
