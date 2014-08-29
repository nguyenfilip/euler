package net.nguyen;

import java.util.HashMap;
import java.util.Map;

/**
 * Hello world!
 * 
 */
public class App {
	public static Map<Long, Long> cache = new HashMap<>();
	public static Long cacheHits=0L;
	public static int maxDepth = 0;
	
	public static void main(String[] args) {
		 
//		System.out.println(colatzTerms(13));
//		
		
		long longestColatzSequence = 0;
		long startNumber = 0;
		long colatzSize = 0;
		for (int i = 1;i<1000000;i++) { 
			colatzSize = colatzTerms(i,0);
			if (colatzSize>longestColatzSequence){
				longestColatzSequence = colatzSize;
				startNumber = i;
			}
		}
					
//		
		System.out.println(startNumber);
		System.out.println("Cache hits: " + cacheHits);
		System.out.println(maxDepth);
			
	}
	
	
	public static long colatzTerms(long x, int depth){
		maxDepth=Math.max(depth,maxDepth);
		if (cache.containsKey(x)) {
			cacheHits++;
			return cache.get(x);
		}
			
		if (x==1)
			return 1;
		
		long nextColatz = x%2==0?x/2:3*x+1;
		
		cache.put(x,1+colatzTerms(nextColatz, depth+1));
		return cache.get(x);
	}

}
