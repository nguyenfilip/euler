package net.nguyen;

import java.util.HashMap;
import java.util.Map;

public class WordNumber {
	private int number = 0;
	private String [] numbers = new String[]{"one", "two", "three", "four", "five","six","seven","eight","nine"};
	private String [] tens = new String[]{"ten", "twenty", "thirty", "forty", "fifty","sixty","seventy","eighty","ninety"};
	private String hundered = "hundred";
	private Map<Integer, String> exceptions = new HashMap<Integer, String>();
	
	{
		exceptions.put(11, "eleven");
		exceptions.put(12, "twelve");
		exceptions.put(13, "thirteen");
		exceptions.put(14, "fourteen");
		exceptions.put(15, "fifteen");
		exceptions.put(16, "sixteen");
		exceptions.put(17, "seventeen");
		exceptions.put(18, "eighteen");
		exceptions.put(19, "nineteen");
	}
	
	public WordNumber(int number) {
		this.number = number;
	}
	
	public String getStringRepresentation() {
		return stringRepre(number);
	}
	
	public String stringRepre(int num){
		if (exceptions.containsKey(num))
			return exceptions.get(num);
		
		if (num < 10)
			return numbers[num-1];
		
		if (num < 100)			
			return tens[num/10-1]+ (num % 10 != 0? ("-" + stringRepre(num%10)):"");
		
		if (num < 1000) 
			return  stringRepre(num/100) +" " + hundered+  (num % 100 != 0?(" and " + stringRepre(num % 100)):"");
		
		if (num == 1000)
			return "one thousand";
		
		return "ERROR";
	}
	
	
	public int getWordLength() {
		return StringNumLetterCounter.len(getStringRepresentation());
	}
	
	
}
