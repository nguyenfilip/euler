package net.nguyen;

import java.util.HashSet;
import java.util.Set;

public class Task21 {
	public static void main(String[] args) {
		ProperDivisorSumCache divisorCache = new ProperDivisorSumCache(10000);
		
		Set<Integer> amicables=  new HashSet<>();
		for (int i = 1; i <= 10000;i++){
			for (int k = 1;k<=10000;k++){
				if (k!=i && divisorCache.getDivisorSumOf(i)==k && divisorCache.getDivisorSumOf(k)==i){
					amicables.add(i);
					amicables.add(k);
				}
			}
		}
		
		System.out.println(amicables.stream().mapToInt(Integer::intValue).sum());
	}
}
