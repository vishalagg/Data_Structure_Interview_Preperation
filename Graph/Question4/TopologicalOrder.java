package Graph.Question4;

import java.util.Stack;

public class TopologicalOrder {

	private Stack<Vertex> stack;
	
	public TopologicalOrder() {
		this.stack = new Stack<Vertex>();
	}
	
	public void dfs(Vertex vertex){
		vertex.setVisited(true);
		
		for(Vertex v: vertex.getNeighbourList()){
			if(!v.isVisited()){
				dfs(v);
			}
		}
		stack.push(vertex);
	}
	
	public void topologicalOrder() {
		while(!stack.isEmpty()) {
			System.out.print(stack.pop()+" ");
		}
	}
}
