package net.nguyen;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PowerOfTwoTest {

	@Test
	public void zeroTest(){
		Assert.assertEquals(new PowerOfTwo(1000).sum(), 1);
	}
	
	@Test
	public void twoTest(){
		PowerOfTwo pot= new PowerOfTwo(1000);
		
		pot.createNextPower();
		Assert.assertEquals(pot.sum(), 2);
		pot.createNextPower();
		Assert.assertEquals(pot.sum(), 4);
		pot.createNextPower();
		Assert.assertEquals(pot.sum(), 8);
		pot.createNextPower();
		Assert.assertEquals(pot.sum(), 7);
		pot.createNextPower();
		Assert.assertEquals(pot.sum(), 5);
	}
	
}
