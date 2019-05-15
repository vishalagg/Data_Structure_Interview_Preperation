package Array;

public class TrappingRainWater {
	
	private static int getWater(int[] heights) {
		int result = 0;
		int[] leftMax = new int[heights.length];
		int[] rightMax = new int[heights.length];
		
		leftMax[0] = heights[0];
		for (int i=1;i<heights.length;i++)
			leftMax[i] = Math.max(leftMax[i-1],heights[i]);
		
		rightMax[heights.length-1] = heights[heights.length-1];
		for (int i=heights.length-2;i>=0;i--) 
			rightMax[i] = Math.max(rightMax[i+1],heights[i]);
		
		for (int i=0;i<heights.length;i++) 
			result += Math.min(leftMax[i],rightMax[i]) - heights[i];
		
		return result;
	}

	public static void main(String[] args) {
		int[] heights = {3,0,0,2,0,4};
		System.out.println("Trapping water amount : "+ getWater(heights));
	}
}
