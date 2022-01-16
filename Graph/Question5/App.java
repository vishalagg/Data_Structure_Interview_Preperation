package Graph.Question5;


import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class App {

    public static int getNumOfNodesAtGivenLevel(Graph graph, int source, int level) {

        int n = graph.getVertices();
        List<Integer>[] adjList = graph.getAdjList();
        int[] visited = new int[n];

        visited[source] = 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);

        while (!queue.isEmpty()) {
            source = queue.poll();

            for (int d: adjList[source]) {
                if (visited[d] == 0) {
                    visited[d] = visited[source] + 1;
                    if (visited[d] < level)
                        queue.add(d);
                }
            }
        }

        int numOfNodes = 0;
        for (int i: visited) {
            if (i == level)
                numOfNodes++;
        }
        return numOfNodes;
    }

    public static void main(String[] args){

        Graph graph = new Graph(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);

        System.out.println(getNumOfNodesAtGivenLevel(graph, 2, 1));
        System.out.println(getNumOfNodesAtGivenLevel(graph, 2, 2));
        System.out.println(getNumOfNodesAtGivenLevel(graph, 2, 3));
        System.out.println(getNumOfNodesAtGivenLevel(graph, 2, 4));
    }
}
