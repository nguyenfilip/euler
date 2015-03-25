package net.nguyen;

import java.util.SortedSet;
import java.util.TreeSet;

public class Task24 {
	public static void main(String[] args) {
		Lex lex = new Lex(new int[]{0,1,2,3,4,5,6,7,8,9});
		for (int i = 1;i<1000000;i++)
			lex.increment();
		
		System.out.println(lex);
	}
}
