package net.nguyen;

import java.util.SortedSet;
import java.util.TreeSet;

public class Task25 {
	public static void main(String[] args) {
		Fibonacci fib = new Fibonacci();
		
		while (fib.getNumDigits() < 1000)
			fib.nextFibonnaci();
		
		System.out.println(fib.getOrder());
	}
}
