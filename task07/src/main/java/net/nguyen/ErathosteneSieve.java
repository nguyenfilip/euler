package net.nguyen;

import java.util.ArrayList;

public class ErathosteneSieve {
	private ArrayList<Integer> foundPrimes = new ArrayList<>();
	
	public ErathosteneSieve(int sieveSize) {
		boolean[] sieve = new boolean[sieveSize+1];
		
		for (int i = 0;i<sieve.length;i++)
			sieve[i]=true;
		
		sieve[0]=false;
		sieve[1]=false;
		
		for (int i =2;i < sieve.length;i++)
			if (sieve[i]) {
				foundPrimes.add(i);
				doSieve(sieve,i);
			}
		
		
	}

	private void doSieve(boolean[] sieve, int k) {
		for (int i = k+k;i < sieve.length;i+=k){
			sieve[i]=false;
		}
	}


	public int getPrime(int i) {
		return foundPrimes.get((int) i-1);
	}

	public int getPrimeCount() {
		return foundPrimes.size();
	}

}
