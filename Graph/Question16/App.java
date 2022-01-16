package Graph.Question16;

/*
- Each node has exactly one parent(except root, having 0 parent)
- There are no cycles
- Graph is connected

or use BFS/DFS to check all above in one go
*/
public class App {

    private static boolean dfsUtil(Graph graph, boolean[] visited, int source) {

        visited[source] = true;
        boolean flag = true;
        for (int nbr: graph.getAdjList()[source]) {
            if (!visited[nbr]) {
                flag = flag & dfsUtil(graph, visited, nbr);
            } else {
                return false;
            }
        }
        return flag;
    }

    private static int getRoot(Graph graph) {
        boolean[] visited = new boolean[graph.getVertices()];
        for (int i=0; i<graph.getVertices(); i++) {
            for (int nbr: graph.getAdjList()[i]) {
                visited[nbr] = true;
            }
        }

        for (int i=0; i<visited.length; i++) {
            if (!visited[i])
                return i;
        }
        return -1;
    }

    public static boolean isTree(Graph graph) {
        boolean[] visited = new boolean[graph.getVertices()];
        int root = getRoot(graph);
        System.out.println("Root : " + root);
        if (root == -1)
            return false;
        boolean res = dfsUtil(graph, visited, root);
        for (int i=0; i< graph.getVertices(); i++) {
            if (!visited[i])
                return false;
        }
        return res;
    }

    public static void main(String[] args) {
        Graph graph1 = new Graph(5);
        graph1.addEdge(0,1);
        graph1.addEdge(0,2);
        graph1.addEdge(0,3);
        graph1.addEdge(3,4);
        System.out.println("isTree : " + isTree(graph1));

        Graph graph2 = new Graph(4);
        graph2.addEdge(0,1);
        graph2.addEdge(0,2);
        graph2.addEdge(0,3);
        graph2.addEdge(3,2);
        System.out.println("isTree : " + isTree(graph2));

        Graph graph3 = new Graph(6);
        graph3.addEdge(0,1);
        graph3.addEdge(0,2);
        graph3.addEdge(0,3);
        graph3.addEdge(4,5);
        System.out.println("isTree : " + isTree(graph3));
    }
}
