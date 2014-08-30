package net.nguyen;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WordSizeTest {

	@Test
	public void stringNumCounterTest(){
		Assert.assertEquals(StringNumLetterCounter.len("three hundred and forty-two"), 23);
		Assert.assertEquals(StringNumLetterCounter.len("one hundred and fifteen"), 20);
	}
	

	@Test
	public void strinWordCountTest(){
		Assert.assertEquals(new WordNumber(342).getWordLength(), 23);
		Assert.assertEquals(new WordNumber(115).getWordLength(), 20);
	}
	
	@Test
	public void underTenTest(){
		Assert.assertEquals(new WordNumber(2).getStringRepresentation(), "two");
	}
	
	
	@Test
	public void teenTest(){
		Assert.assertEquals(new WordNumber(217).getStringRepresentation(), "two hundred and seventeen");
	}
	
	
	@Test
	public void underHundred(){
		Assert.assertEquals(new WordNumber(20).getStringRepresentation(), "twenty");
		Assert.assertEquals(new WordNumber(42).getStringRepresentation(), "forty-two");
		Assert.assertEquals(new WordNumber(12).getStringRepresentation(), "twelve");
	}
	
	@Test
	public void underThousand(){
		Assert.assertEquals(new WordNumber(111).getStringRepresentation(), "one hundred and eleven");
		Assert.assertEquals(new WordNumber(600).getStringRepresentation(), "six hundred");
		Assert.assertEquals(new WordNumber(780).getStringRepresentation(), "seven hundred and eighty");
		Assert.assertEquals(new WordNumber(987).getStringRepresentation(), "nine hundred and eighty-seven");
	}
	
	@Test
	public void basicTest(){
		int result = 0;
		for (int i = 1; i <=5;i++)
			result += new WordNumber(i).getWordLength();
		
		Assert.assertEquals(result, 19);
	}
}
