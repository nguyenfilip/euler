package net.nguyen;

import java.util.ArrayList;
import java.util.List;

public class Arithmetic {

	public static IntegerNumber sum(IntegerNumber num1, IntegerNumber num2){
		IntegerNumber result= new IntegerNumber(0);
		int modulo=0;
		for (int i = 0; i < Math.max(num1.getLen(),num2.getLen());i++){
			int columnResult = num1.getNumFromBack(i) + num2.getNumFromBack(i) + modulo;
			result.addDigitsToFront(lastDigit(columnResult));
			modulo=tenDigit(columnResult);
		}
		
		if (modulo != 0)
			result.addDigitsToFront(modulo);
		
		return result;
	}
	
	public static IntegerNumber  multiply(IntegerNumber num1, IntegerNumber num2){
		if (num1.getLen() < num2.getLen())
			throw new IllegalArgumentException("This simple multiplicator expects the first number to be bigger than the second");
		
		int modulo =0 ;
		List<IntegerNumber> rows = new ArrayList<IntegerNumber>();
		for (int i = 0; i < num2.getLen();i++){
			IntegerNumber row = new IntegerNumber(0);
			rows.add(addZerosAtRowFront(i,row));
			for (int k = 0;k < num1.getLen();k++) {
				int result = num1.getNumFromBack(k) * num2.getNumFromBack(i) + modulo;
				if (k==num1.getLen()-1)
					row.addDigitsToFront(result);
				else {
					row.addDigitsToFront(lastDigit(result));
					modulo = tenDigit(result);
				}
			}
			
		}
		
		IntegerNumber sumAll=new IntegerNumber(0);
		for (IntegerNumber x: rows)
			sumAll=sum(sumAll,x);
		
		return sumAll;
	}


	private static IntegerNumber addZerosAtRowFront(int i, IntegerNumber row) {
		for (int k=0;k<i;k++)
			row.addDigitsToFront(0);
		return row;
	}


	private static int lastDigit(int result) {
		if (result > 9)
			return result%10;
		else
			return result;
	}

	private static int tenDigit(int result) {
		if (result > 9)
			return result/10;
		else 
			return 0;
	}
}
