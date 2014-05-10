package net.nguyen;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		ErathosteneSieve primesGen = new ErathosteneSieve(190000);
		System.out.println(primesGen.getPrime(10001));
	}

}
