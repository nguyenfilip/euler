package net.nguyen;

import java.util.ArrayList;
import java.util.List;

public class Arithmetic {

	public static IntegerNumber sum(IntegerNumber num1, IntegerNumber num2){
		IntegerNumber result= new IntegerNumber();
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
		if (num1.getLen() < num2.getLen()) {
			IntegerNumber x = num1;
			num1=num2;
			num2=x;
		}
			
		int modulo =0 ;
		List<IntegerNumber> rows = new ArrayList<IntegerNumber>();
		for (int i = 0; i < num2.getLen();i++){
			int lowDigit= num2.getNumFromBack(i);
			IntegerNumber row = new IntegerNumber();
			rows.add(addZerosAtRowFront(i,row));
			modulo=0;
			for (int k = 0;k < num1.getLen();k++) {
				int result = num1.getNumFromBack(k) * lowDigit + modulo;
				if (k==num1.getLen()-1)
					row.addDigitsToFront(result);
				else {
					row.addDigitsToFront(lastDigit(result));
					modulo = tenDigit(result);
				}
			}
			
		}
		
		IntegerNumber sumAll=new IntegerNumber(0);
		System.out.println(rows.size());
		for (IntegerNumber x: rows) {
			System.out.println(x);
			sumAll=sum(sumAll,x);
		}
		
		return sumAll;
	}


	
	public static int  sumDigits(IntegerNumber num1){
		int sum = 0;
		
		for (int i = 0; i < num1.getLen();i++){
			sum+= num1.getNumFromBack(i);
		}
		
		return sum;
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
