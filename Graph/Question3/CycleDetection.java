package Graph.Question3;

public class CycleDetection {

	public boolean detectCycle(Vertex vertex){
		boolean flag = false;
		vertex.setBeingVisited(true);
		
		for (Vertex v : vertex.getNeighbourList()) {
			if (v.isBeingVisited()){
				flag = true;
				return flag;
			}
			if (!v.isVisited()){
				v.setVisited(true);
				flag = flag || detectCycle(v);
			}
		}
		
		vertex.setBeingVisited(false);
		vertex.setVisited(true);	
		return flag;
	}
	
}
