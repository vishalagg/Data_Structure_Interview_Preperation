package DP;

//Gold Mine Problem
public class GoldMine {

	private static int maxGoldCollectionHelper(int[][] mat,int row,int rows,int col,int cols,int[][] dict) {
		
//		System.out.println("Row"+row+" col"+col);
		if(row>=rows || row<0) {
			return 0;
		}
		if (dict[row][col]!=0) {
			return dict[row][col];
		}
		if(col==cols-1){
			dict[row][col] = mat[row][col];
			return mat[row][col];
		}
		int i = maxGoldCollectionHelper(mat,row-1,rows,col+1,cols,dict);
		int k = maxGoldCollectionHelper(mat,row,rows,col+1,cols,dict);
		int j = maxGoldCollectionHelper(mat,row+1,rows,col+1,cols,dict);
		
		dict[row][col] = mat[row][col] + Math.max(i,Math.max(j,k));
		return dict[row][col];
	}
	
	public static int maxGoldCollection(int[][] mat,int rows,int cols) {
		int i =0;
		int maxGoldCount = 0;
		int count = 0;
		int[][] dict = new int[rows][cols];
		for (i=0;i<rows;i++) {
			count = maxGoldCollectionHelper(mat,i,rows,0,cols,dict);
			if(count>maxGoldCount){
				maxGoldCount = count;
			}
		}
		return maxGoldCount;
	}
	
	public static void main(String[] args) {
		int[][] mat =  { {1, 3, 1, 5},
                {2, 2, 4, 1},
                {5, 0, 2, 3},
                {0, 6, 1, 2}};
		
		System.out.println(maxGoldCollection(mat,4,4));
	}
}
