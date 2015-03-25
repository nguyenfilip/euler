package net.nguyen;

import java.util.Arrays;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Task24Test {

	@Test 
	public void simple(){
		Lex lex1 = new Lex(new int[]{0});
		Assert.assertEquals(lex1.toString(), "0");
		Lex lex2 = new Lex(new int[]{0,1});
		Assert.assertEquals(lex2.toString(), "01");
	}
	
	@Test
	public void findDescendingPoint(){
		Lex lex = new Lex(new int[]{1,3,2,0});
		Assert.assertEquals(lex.findDescendingPoint(), 0);
		lex = new Lex(new int[]{1,2,3,4});
		Assert.assertEquals(lex.findDescendingPoint(), 2);
		lex = new Lex(new int[]{4,3,2,1});
		Assert.assertEquals(lex.findDescendingPoint(), -1);
	}
	
	@Test
	public void findSmallestBigger(){
		Lex lex = new Lex(new int[]{1,3,2,0});
		Assert.assertEquals(lex.findSmallestBigger(0), 2);
		lex = new Lex(new int[]{4,1,5,7,9});
		Assert.assertEquals(lex.findSmallestBigger(2), 3);
		lex = new Lex(new int[]{4,1,8,7,9});
		Assert.assertEquals(lex.findSmallestBigger(2), 4);
		lex = new Lex(new int[]{4,1,5,7,9});
		Assert.assertEquals(lex.findSmallestBigger(1), 2);
	}
	
	@Test
	public void increment(){
		Lex lex = new Lex(new int[]{0,1,2});
		Assert.assertEquals(lex.toString(), "012");
		lex.increment();
		Assert.assertEquals(lex.toString(), "021");
		lex.increment();
		Assert.assertEquals(lex.toString(), "102");
		lex.increment();
		Assert.assertEquals(lex.toString(), "120");
		lex.increment();
		Assert.assertEquals(lex.toString(), "201");
		lex.increment();
		Assert.assertEquals(lex.toString(), "210");
		
		lex = new Lex(new int[]{5,1,3,2,0});
		lex.increment();
		Assert.assertEquals(lex.toString(), "52013");
		lex.increment();
		Assert.assertEquals(lex.toString(), "52031");
	}
}
