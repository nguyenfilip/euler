package net.nguyen;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Lex is a lexicographical number  of a certain string length.
 * 
 * @author fnguyen
 *
 */
public class Lex{
	private int[] currentLex;
	
	public Lex(int[] lex){
		currentLex=  lex;
	}
	
	public void increment(){
		int index = findDescendingPoint();
		int indexBigger = findSmallestBigger(index);
		
		int x = currentLex[index];
		currentLex[index] = currentLex[indexBigger];
		currentLex[indexBigger] = x;
		
		if (index < currentLex.length-1)
			Arrays.sort(currentLex,index+1,currentLex.length);
	}
	
	
	/**
	 * Finds index of a number that on the right side that is bigger then number on "index" but is
	 * the smallest such number on the right side
	 * @param index
	 * @return
	 */
	public int findSmallestBigger(int index) {
		int candidate = -1;
		
		for (int i = index+1; i<currentLex.length;i++){
			if (currentLex[index] < currentLex[i]) {
				if (candidate == -1 || currentLex[i] < currentLex[candidate])
					candidate = i;
			}				
		}
		return candidate;
	}


	/**
	 * Returns index of a number that is the first descending from the right side. 
	 * For example "653421" has descending point 2 because number 3 is the first desending 
	 * @return -1 if no such index exists
	 */
	public int findDescendingPoint() {
		if (currentLex.length < 1)
			return -1;
		
		int last = currentLex[currentLex.length-1];
		for (int i = currentLex.length-1;i >= 0; i--){
			if (currentLex[i] < last){
				return i;
			}
			last = currentLex[i];
		}
		return -1;
	}


	@Override
	public String toString() {
		return Arrays.stream(currentLex)
				.mapToObj(Integer::toString)
				.collect(Collectors.joining());
	}

}
