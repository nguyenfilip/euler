package net.nguyen;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		int i = 1;
		while (getDivisors(getTriangular(i))<=500){
			i++;
		}
		System.out.println(getDivisors(getTriangular(i)));
		System.out.println(getTriangular(i));
	}

	private static int getTriangular(int x) {
		int res= 0;
		for (int i = x; i>0;i--)
			res+=i;
		
		return res;
	}

	private static int getDivisors(int x) {
		
		int divisors = 0;
		for (int i = 1;i<=Math.sqrt(x);i++){
			if (x%i==0) {
				divisors++;
				if (i*i != x)
					divisors++;
			}
				
		}
		
		return divisors;
	}

}
