package net.nguyen;

import java.util.Date;
import java.util.Random;


public class PrimeGenerator {
	private long lastPrime= 1;
	private Random rand = new Random();
	
	public long nextPrime(){
		
		do {
			lastPrime++;
		} while (!isPrime(lastPrime));
		
		return lastPrime;
	}
	
	public boolean isPrime(Long number) {
		if (number<2)
			return false;
		
		int candidateDivisor = 2;
		while (candidateDivisor <= Math.sqrt(number)){
			if (number % candidateDivisor++ == 0)
				return false;
		}
		return true;
	}
}
