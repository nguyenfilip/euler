package net.nguyen;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SieveTest {
	
	@Test 
	public void simpleTest(){
		ErathosteneSieve sieve=  new ErathosteneSieve(3);
		Assert.assertEquals(sieve.getPrimeCount(), 2);
		Assert.assertEquals(sieve.getPrime(1), 2);
		Assert.assertEquals(sieve.getPrime(2), 3);
	}
	
	@Test 
	public void bigSieve(){
		ErathosteneSieve sieve=  new ErathosteneSieve(11);
		Assert.assertEquals(sieve.getPrimeCount(), 5);
		Assert.assertEquals(sieve.getPrime(1), 2);
		Assert.assertEquals(sieve.getPrime(2), 3);
		Assert.assertEquals(sieve.getPrime(3), 5);
		Assert.assertEquals(sieve.getPrime(4), 7);
		Assert.assertEquals(sieve.getPrime(5), 11);
	}
}
