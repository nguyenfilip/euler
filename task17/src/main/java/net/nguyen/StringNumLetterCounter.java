package net.nguyen;

public class StringNumLetterCounter {
	
	public static int len (String string){
		String onlyLetters = string.replace(" ", "").replace("-", "");
		return onlyLetters.length();
	}
}
