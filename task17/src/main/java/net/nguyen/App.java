package net.nguyen;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		int result = 0;
		for (int i = 1; i <=1000;i++)
			result += new WordNumber(i).getWordLength();
		System.out.println(result);
		
	}
	


}
