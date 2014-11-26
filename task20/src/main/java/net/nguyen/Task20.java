package net.nguyen;

public class Task20 {
	public static void main(String[] args) {
		IntegerNumber result  = new IntegerNumber(1);
		IntegerNumber one = new IntegerNumber(1);
		IntegerNumber next = new IntegerNumber(0);
		
		
		for (int i = 1; i <= 100;i++ ) {
			next = Arithmetic.sum(next, one);
			System.out.println(next);
			
			result = Arithmetic.multiply(result,next);
			System.out.println(result);
		}
		System.out.println(Arithmetic.sumDigits(result));
	}
}
