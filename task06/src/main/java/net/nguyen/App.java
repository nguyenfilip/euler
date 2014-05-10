package net.nguyen;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		int sumOfSquares = 0;
		int squareOfSums=0;
		for (int i = 0; i <=100;i++){
			sumOfSquares+= Math.pow(i, 2);
			squareOfSums+=i;
		}
		squareOfSums=(int) Math.pow(squareOfSums, 2);
		
		System.out.println(squareOfSums-sumOfSquares);
	}

}
