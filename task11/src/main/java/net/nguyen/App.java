package net.nguyen;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) throws IOException {
		List<String> strings = FileUtils.readLines(new File("data"),"utf-8");
		
		int rowCount = strings.size();
		int colCount= StringUtils.split(strings.get(0), ' ').length;
		
		int [][] grid = new int[rowCount][colCount];
		
		int i = -1;
		for (String s : strings) { 
			i++;
			int k = -1;
			for (String col : StringUtils.split(s,' ')) {
				k++;
				grid[i][k]=Integer.parseInt(col);
			}
		}
		
		int maxProduct = 0;
		
		for (int k = 0;k<rowCount; k++){
			for (int j = 0;j<colCount; j++){ 
				
				if (k>=3 && j<colCount -3)
					maxProduct = Math.max(maxProduct,
							grid[k][j] * grid[k-1][j+1] * grid[k-2][j+2] * grid[k-3][j+3]);
				
				if (k < rowCount -3 && j < colCount-3){
					maxProduct = Math.max(maxProduct, grid[k][j]
							* grid[k + 1][j + 1] * grid[k + 2][j + 2]
							* grid[k + 3][j + 3]);
					maxProduct = Math.max(maxProduct, grid[k][j]
							* grid[k + 1][j] * grid[k + 2][j] * grid[k + 3][j]);
					maxProduct = Math.max(maxProduct, grid[k][j]
							* grid[k][j + 1] * grid[k][j + 2] * grid[k][j + 3]);
				}
			}
		}
		System.out.println(maxProduct);
	}

	
}
