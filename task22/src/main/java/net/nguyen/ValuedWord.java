package net.nguyen;

import java.util.Comparator;

public class ValuedWord implements Comparable<ValuedWord>{
	private int cachedValue =0;
	private StringBuilder word= new StringBuilder();
	
	public void addChar(char c){
		cachedValue+=CharHelper.alphaValue(c);
		word.append(c);
	}
	
	public int getChachedValue(){
		return cachedValue;
	}
	

	
	@Override
	public int hashCode() {
		return word.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		
		if (! (obj instanceof ValuedWord))
			return false;
		
		ValuedWord v = (ValuedWord)obj;
		return v.word.equals(word);
	}

	@Override
	public int compareTo(ValuedWord o) {
		return word.toString().compareTo(o.word.toString());
	}
	
	@Override 
	public String toString() {
		return word.toString();
	}
}
