package net.nguyen;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Integer number starting with 
 */
public class IntegerNumberTest {
	@Test
	public void numberOneTest(){
		IntegerNumber inum = new IntegerNumber(1);
		
		Assert.assertEquals(inum.getLen(), 1);
		Assert.assertEquals(inum.getNumFromBack(0), 1);
		Assert.assertEquals(inum.getNumFromBack(1), 0);
	}
	
	@Test
	public void expandNumber(){
		IntegerNumber inum = new IntegerNumber(1);
		inum.addDigitsToFront(3);
		Assert.assertEquals(inum.getLen(), 2);
		Assert.assertEquals(inum.getNumFromBack(0), 1);
		Assert.assertEquals(inum.getNumFromBack(1), 3);
		Assert.assertEquals(inum.getNumFromBack(2), 0);
	}
	
}
