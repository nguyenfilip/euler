package net.nguyen;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProperDivisorSumCacheTest {

	
	@Test
	public void simple1(){
		ProperDivisorSumCache sumCache = new ProperDivisorSumCache(4);
		Assert.assertEquals(sumCache.getDivisorSumOf(1), new Integer(0));
		Assert.assertEquals(sumCache.getDivisorSumOf(2), new Integer(1));
		Assert.assertEquals(sumCache.getDivisorSumOf(3), new Integer(1));
		Assert.assertEquals(sumCache.getDivisorSumOf(4), new Integer(3));
	}
	
	@Test
	public void complex(){
		ProperDivisorSumCache sumCache = new ProperDivisorSumCache(600);
		Assert.assertEquals(sumCache.getDivisorSumOf(600), new Integer(sumCache.getDivisorSumOf(300)+300));
	}
	
	@Test
	public void perfTest(){
		long startMilis= System.currentTimeMillis();
		ProperDivisorSumCache sumCache = new ProperDivisorSumCache(10000);
		Assert.assertTrue(System.currentTimeMillis()-startMilis > 3000, "Perf test failed");		
	}
	
}
