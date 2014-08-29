package net.nguyen;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		int DIAMETER=21;
		long[][]pathsFrom = new long[DIAMETER][DIAMETER];
		
		fillPathCombos(pathsFrom);
		System.out.println(pathsFrom[0][0]);
	}

	public static void fillPathCombos(long[][] pathsFrom) {
		pathsFrom[pathsFrom.length-1][pathsFrom.length-1]=1;
		
		int row = pathsFrom.length-1;
		int col = pathsFrom.length-2;
		
		while (col >= 0 && row >= 0){			
			updateLayerStarting(row,col,pathsFrom);
			
			//Going around bottom and left edge
			if (col > 0)
				col--;
			else row--;
		}
	}

	public static void updateLayerStarting(int row, int col, long[][] pathsFrom) {
		while (col < pathsFrom.length && row >= 0){
			pathsFrom[row][col]=zeroBasedVal(row+1,col,pathsFrom) + zeroBasedVal(row,col+1, pathsFrom);
			col++;
			row--;
		}
	}

	public static long zeroBasedVal(int row, int i, long[][] pathsFrom) {
		if (row >=pathsFrom.length || i >=pathsFrom.length || row<0 || i < 0)
			return 0;
		
		return pathsFrom[row][i];
	}


}
