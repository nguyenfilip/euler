package net.nguyen;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task23 {
	public static void main(String[] args) {
		Set<Integer> abundantNumbers = IntStream.range(1, 28123).filter(Task23::isAbundant).boxed().collect(Collectors.toSet());
		
		Set<Integer> sumsOfAbundantNumbers = new HashSet<Integer>();
		for (Integer i : abundantNumbers){
			for (Integer k: abundantNumbers){
				if (i+k <= 28123)
					sumsOfAbundantNumbers.add(i+k);
			}
		}
		System.out.println(IntStream.range(1, 28123+1).sum() - sumsOfAbundantNumbers.stream().reduce(new Integer(0), (a,b)->a+b));
	}


	public static boolean isAbundant(int x) {
		int sum=0;
		for (int i = x/2;i>0;i--){
			if (x%i==0)
				sum+=i;
			
			if (sum > x)
				return true;
		}
		return false;
	}
	

	public static Set<Integer> getAbundantNumbersSmallerThan(int x) {
		return IntStream.range(1, x).filter(Task23::isAbundant).boxed().collect(Collectors.toSet());
	}
}
