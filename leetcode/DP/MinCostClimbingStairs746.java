package leetcode.DP;

public class MinCostClimbingStairs746 {

	public static void main(String[] args) {
		
		int[] cost = {0,1,2,0};
		
		int[] hash = new int[cost.length+1];
		System.out.println(minCostClimbingStairs(cost,0 ,hash));
	}
	
	
	public static int minCostClimbingStairs(int[] cost,int i,int[] hash) {
		
		if(i>=cost.length)
			return 0;
		
		if(hash[i]!=0)
			return hash[i];
		
		if(i==cost.length-1 || i==cost.length-2) {
			hash[i] = cost[i];
			return cost[i];
		}
		
		int step_one = minCostClimbingStairs(cost,i+1,hash);
		int step_two = minCostClimbingStairs(cost,i+2,hash);
		
		if (i==0){
			hash[i] = Math.min(cost[i]+step_two, step_one);
		}else{
			hash[i] = cost[i] + Math.min(step_one, step_two);			
		}
		return hash[i];
	}
}
