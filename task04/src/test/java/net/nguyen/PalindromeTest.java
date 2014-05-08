package net.nguyen;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PalindromeTest {
	
	@Test 
	public void simpleDigit(){
		PalindromGenerator simple= new PalindromGenerator(1, 2);
		assertPalindromeGenerator(simple, new int[]{1,2});
	}
	@Test 
	public void descendingOrder(){
		PalindromGenerator simple= new PalindromGenerator(3, 1);
		assertPalindromeGenerator(simple, new int[]{3,2,1});
	}
	@Test 
	public void onePalindrome(){
		PalindromGenerator simple= new PalindromGenerator(3, 3);
		assertPalindromeGenerator(simple, new int[]{3});
	}
	@Test 
	public void noPalindrome(){
		PalindromGenerator simple= new PalindromGenerator(12, 12);
		assertPalindromeGenerator(simple, new int[]{});
	}
	
	@Test 
	public void onePalindromeTwoDigits(){
		PalindromGenerator simple= new PalindromGenerator(11, 11);
		assertPalindromeGenerator(simple, new int[]{11});
	}
	@Test 
	public void twoPalindromes(){
		PalindromGenerator simple= new PalindromGenerator(11, 22);
		assertPalindromeGenerator(simple, new int[]{11,22});
	}

	@Test 
	public void twoPalindromesDescending(){
		PalindromGenerator simple= new PalindromGenerator(22,11);
		assertPalindromeGenerator(simple, new int[]{22,11});
	}
	
	@Test 
	public void twoPalindromesDescendingGap(){
		PalindromGenerator simple= new PalindromGenerator(24,10);
		assertPalindromeGenerator(simple, new int[]{22,11});
	}

	private void assertPalindromeGenerator(PalindromGenerator simple,
			int[] expected) {
		int i =0;
		
		for (int palindrom : simple){
			i++;
			Assert.assertTrue(i<=expected.length,String.format("Expecting at most %s palindromes",expected.length));
			Assert.assertEquals(palindrom, expected[i-1]);
		}
		Assert.assertEquals(i, expected.length,"Didnt generate correct amount of palindromes");
	}
	
	
	
	@Test 
	public void palindromeTest(){
		Assert.assertTrue(PalindromGenerator.isPalindrome("a"));
		Assert.assertTrue(PalindromGenerator.isPalindrome("aa"));
		Assert.assertTrue(PalindromGenerator.isPalindrome("aca"));
		Assert.assertTrue(PalindromGenerator.isPalindrome("acca"));
		Assert.assertFalse(PalindromGenerator.isPalindrome("ab"));
		Assert.assertFalse(PalindromGenerator.isPalindrome("abb"));
	}
}
