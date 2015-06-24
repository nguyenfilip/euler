package net.nguyen;

import java.math.BigInteger;
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
public class Fibonacci{
	BigInteger fib1;
	BigInteger fib2;
	BigInteger thisFibonnaci ;
	BigInteger num;
	
	public Fibonacci(){
		fib1=new BigInteger("1");
		fib2=new BigInteger("1");
		thisFibonnaci = new BigInteger("2");
		num=new BigInteger("3");
	}
	
	public BigInteger getOrder(){
		return num;
	}
	
	public BigInteger getNumber(){
		return thisFibonnaci;
	}
	
	public void nextFibonnaci(){
		fib1=fib2;
		fib2=thisFibonnaci;
		thisFibonnaci = thisFibonnaci.add(fib1);
		num = num.add(BigInteger.ONE);
	}
	
	public int getNumDigits(){
		return thisFibonnaci.toString().length();
	}
	
	
}
