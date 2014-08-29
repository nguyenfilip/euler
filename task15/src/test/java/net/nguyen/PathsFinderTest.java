package net.nguyen;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PathsFinderTest {

	@Test
	public void zeroBasedValTest(){
		Assert.assertEquals(App.zeroBasedVal(2, 1, new long[][]{{1L,2L},{1L,2L}}),0);
		Assert.assertEquals(App.zeroBasedVal(1, 2, new long[][]{{1L,2L},{1L,2L}}),0);
		Assert.assertEquals(App.zeroBasedVal(2, 2, new long[][]{{1L,2L},{1L,2L}}),0);
		Assert.assertEquals(App.zeroBasedVal(1, 1, new long[][]{{1L,2L},{1L,2L}}),2L);
	}
	
	@Test
	public void updateLayerStartingTest(){
		long[][] arr = new long[3][3];
		arr[arr.length-1][arr.length-1]=1;
		
		
		App.updateLayerStarting(2, 1, arr);
		Assert.assertEquals(arr[2][1],1L);
		Assert.assertEquals(arr[1][2],1L);
		
		App.updateLayerStarting(2, 0, arr);
		Assert.assertEquals(arr[2][0],1L);
		Assert.assertEquals(arr[1][1],2L);
		Assert.assertEquals(arr[0][2],1L);
	}
	
	@Test
	public void fillPathCombosTest(){
		long[][] arr = new long[2][2];

		App.fillPathCombos(arr);

		Assert.assertEquals(arr[0][0], 2);

		arr = new long[3][3];
		App.fillPathCombos(arr);

		Assert.assertEquals(arr[0][0], 6);
	}
	
}
