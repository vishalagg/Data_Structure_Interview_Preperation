package Graph.Question14;

public class App {

    public static int getEdgesCount(Graph graph) {

        int size = 0;
        for (int i=0; i<graph.getVertices(); i++) {
            size  += graph.getAdjList()[i].size();
        }
        return size/2;
    }

    public static void main(String[] args) {

        Graph graph = new Graph(9);
        graph.addEdge(0,2);
        graph.addEdge(0,5);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(5,3);
        graph.addEdge(5,6);
        graph.addEdge(3,6);
        graph.addEdge(6,7);
        graph.addEdge(6,8);
        graph.addEdge(6,4);
        graph.addEdge(7,8);

        System.out.println(getEdgesCount(graph));
    }
}
