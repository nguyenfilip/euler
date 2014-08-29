package net.nguyen;

public class Recursion {
	static long[][] cache = new long[100][100] ;
	static int maxDepth = 0;
	public static void main(String[] args) {
		for (int i =0 ;i<cache.length;i++)
			for (int j =0 ;j<cache.length;j++)
				cache[i][j]=-1;
		
		System.out.println(allPaths(0,0,20,0));
		System.out.println(maxDepth);
	}

	public static long allPaths(int row, int col, int gridSize, int depth) {
		maxDepth = Math.max(depth,maxDepth);
		if (row>gridSize || col > gridSize)
			return 0;
		
		if (cache[row][col]!=-1)
			return cache[row][col];
		
		if (row == col && row==gridSize)
			return 1;
		
		cache[row][col]= allPaths(row+1, col, gridSize, depth+1) + allPaths(row,col+1, gridSize, depth+1);
		return cache[row][col];
	}
}
