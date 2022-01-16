package Graph.Question4;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args){
		
		TopologicalOrder tp = new TopologicalOrder();
		
		List<Vertex> graph = new ArrayList<Vertex>();
		
		graph.add(new Vertex(0));
		graph.add(new Vertex(1));
		graph.add(new Vertex(2));
		graph.add(new Vertex(3));
		graph.add(new Vertex(4));
		graph.add(new Vertex(5));
		
		graph.get(5).addNeighbour(graph.get(2));
		graph.get(5).addNeighbour(graph.get(0));
		graph.get(4).addNeighbour(graph.get(0));
		graph.get(4).addNeighbour(graph.get(1));
		graph.get(2).addNeighbour(graph.get(3));
		graph.get(3).addNeighbour(graph.get(1));
		
		for (Vertex v:graph) {
			if (!v.isVisited()) {
				tp.dfs(v);
			}
		}
		tp.topologicalOrder();
	}
}
