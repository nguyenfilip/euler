package net.nguyen;

import org.testng.Assert;
import org.testng.annotations.Test;


public class ArithmeticTest {

	@Test
	public void sumTest(){
		IntegerNumber inum = new IntegerNumber(1);
		IntegerNumber inum2=new IntegerNumber(0);
		
		Assert.assertEquals(Arithmetic.sum(inum, inum2).getLen(),1);
		Assert.assertEquals(Arithmetic.sum(inum, inum2).getNumFromBack(0),1);
	}
	
	@Test
	public void sumTest2(){
		IntegerNumber inum = new IntegerNumber(6);
		IntegerNumber inum2=new IntegerNumber(6);
		
		Assert.assertEquals(Arithmetic.sum(inum, inum2).getLen(),2);
		Assert.assertEquals(Arithmetic.sum(inum, inum2).getNumFromBack(0),2);
		Assert.assertEquals(Arithmetic.sum(inum, inum2).getNumFromBack(1),1);
	}
	

	@Test
	public void multiplyTest(){
		IntegerNumber inum = new IntegerNumber(6);
		IntegerNumber inum2=new IntegerNumber(6);
		
		Assert.assertEquals(Arithmetic.multiply(inum, inum2).getLen(),2);
		Assert.assertEquals(Arithmetic.multiply(inum, inum2).getNumFromBack(0),6);
		Assert.assertEquals(Arithmetic.multiply(inum, inum2).getNumFromBack(1),3);
	}
	

	@Test
	public void multiplyTest2(){
		IntegerNumber inum = new IntegerNumber(6);
		IntegerNumber inum2=new IntegerNumber(6);
		IntegerNumber inum3=new IntegerNumber(8);
		
		Assert.assertEquals(Arithmetic.multiply(Arithmetic.multiply(inum, inum2),inum3).getLen(),3);
		Assert.assertEquals(Arithmetic.multiply(Arithmetic.multiply(inum, inum2),inum3).getNumFromBack(0),8);
		Assert.assertEquals(Arithmetic.multiply(Arithmetic.multiply(inum, inum2),inum3).getNumFromBack(1),8);
		Assert.assertEquals(Arithmetic.multiply(Arithmetic.multiply(inum, inum2),inum3).getNumFromBack(2),2);
		
	}
	
	@Test
	public void multiplyTest3(){
		IntegerNumber inum = new IntegerNumber(6);
		IntegerNumber inum2=new IntegerNumber(6);
		IntegerNumber inum3=new IntegerNumber(8);
		
		IntegerNumber inum288 = Arithmetic.multiply(Arithmetic.multiply(inum, inum2),inum3);
		IntegerNumber inum289 = Arithmetic.sum(inum288, new IntegerNumber(1));
		System.out.println("Last multiplication");
		Assert.assertEquals(Arithmetic.multiply(inum288, inum289).getLen(), 5);
		Assert.assertEquals(Arithmetic.multiply(inum288, inum289).getNumFromBack(0), 2);
		Assert.assertEquals(Arithmetic.multiply(inum288, inum289).getNumFromBack(1), 3);
		Assert.assertEquals(Arithmetic.multiply(inum288, inum289).getNumFromBack(2), 2);
		Assert.assertEquals(Arithmetic.multiply(inum288, inum289).getNumFromBack(3), 3);
		Assert.assertEquals(Arithmetic.multiply(inum288, inum289).getNumFromBack(4), 8);
		
	}
	
	@Test
	public void sumDigitsTest(){
		IntegerNumber inum = new IntegerNumber(6);
		IntegerNumber inum2=new IntegerNumber(6);
		IntegerNumber inum3=new IntegerNumber(8);
		
		
		IntegerNumber num288=Arithmetic.multiply(Arithmetic.multiply(inum, inum2),inum3);
		
		Assert.assertEquals(Arithmetic.sumDigits(num288), 18);
	}
	
}
