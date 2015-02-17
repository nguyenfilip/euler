package net.nguyen;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Task23Test {

	@Test 
	public void abNumbersSmallerThan(){
		Assert.assertEquals(Task23.getAbundantNumbersSmallerThan(12).size(),0);
		Assert.assertEquals(Task23.getAbundantNumbersSmallerThan(13).size(),1);
		Assert.assertEquals(Task23.getAbundantNumbersSmallerThan(21).size(),3);
	}
	
	@Test 
	public void abundantTest(){
		Assert.assertFalse(Task23.isAbundant(1));
		Assert.assertFalse(Task23.isAbundant(2));
		
		Assert.assertTrue(Task23.isAbundant(12));
	}
}
