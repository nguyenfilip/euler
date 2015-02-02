package net.nguyen;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProperDivisorSumCacheTest {

	
	@Test
	public void simple1(){
		ProperDivisorSumCache sumCache = new ProperDivisorSumCache(7);
		Assert.assertEquals(sumCache.getDivisorSumOf(1), new Integer(0));
		Assert.assertEquals(sumCache.getDivisorSumOf(2), new Integer(1));
		Assert.assertEquals(sumCache.getDivisorSumOf(3), new Integer(1));
		Assert.assertEquals(sumCache.getDivisorSumOf(4), new Integer(3));
		Assert.assertEquals(sumCache.getDivisorSumOf(6), new Integer(6));
		Assert.assertEquals(sumCache.getDivisorSumOf(7), new Integer(1));
	}
	
	
	@Test
	public void perfTest(){
		long startMilis= System.currentTimeMillis();
		ProperDivisorSumCache sumCache = new ProperDivisorSumCache(10000);
		Assert.assertTrue(System.currentTimeMillis()-startMilis < 3000, "Perf test failed");		
	}
	
}
