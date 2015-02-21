package net.nguyen;

public class CharHelper {

	private static final int A_VALUE=(int)'A';
	
	public static int alphaValue(char c){
		return c-A_VALUE+1;
	}
}
