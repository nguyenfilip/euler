package net.nguyen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.beust.jcommander.internal.Lists;

/**
 * Integer number starting with 
 */
public class IntegerNumber {
	private List<Integer> num = new ArrayList<Integer>();
	
	public IntegerNumber(int i){
		if (i<0 || i > 9)
			throw new IllegalArgumentException("Only one digit number can be constructed");
		addDigitsToFront(i);
	}
	
	public IntegerNumber() {
		
	}

	public int getLen(){
		return num.size();
	}
	
	public int getNumFromBack(int i){
		if (i < 0)
			throw new IllegalArgumentException("The position to be returned must be higher than 0");
		
		if (num.size()-1<i)
			return 0;
		
		return num.get(i);		
	}
	
	public void addDigitsToFront(int i){
		if (i<0 || i > 99)
			throw new IllegalArgumentException("Digit to be added must be bigger than 0 and lower then 100");
		
		 if (i > 9){
			num.add(i%10);
			i=i/10;
		 }
		 num.add(i);
	}
	
	@Override
	public String toString() {
		ArrayList<Integer> list = new ArrayList<Integer>(num);
		Collections.reverse(list);
		return Arrays.toString(list.toArray());
	}
	
}
