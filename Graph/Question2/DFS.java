package Graph.Question2;

import java.util.Stack;

public class DFS {

	public void dfsWithStack(Vertex root) {
		Stack<Vertex> stack = new Stack<Vertex>();
		
		if (root!=null) {
			stack.add(root);
			root.setVisited(true);
			
			while(!stack.isEmpty()) {
				Vertex vertex = stack.pop();
				System.out.print(vertex+" ");
				
				for (Vertex v: vertex.getNeighbourList())
					if (!v.isVisited()){
						v.setVisited(true);
						stack.add(v);
					}
			}
		}
	}
	
	public void dfsWithRecursion(Vertex vertex){
		
		if(!vertex.isVisited()) {
			vertex.setVisited(true);
			System.out.print(vertex+" ");
			for (Vertex v:vertex.getNeighbourList()){
				dfsWithRecursion(v);
			}
		}
		
	}
}
