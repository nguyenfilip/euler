package net.nguyen;

import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


/**
 * Hello world!
 *
 */
public class App 
{

	
    public static void main( String[] args ) throws InterruptedException
    {
    	
    	long num = 600851475143L;
    	
    	PrimeGenerator primegen = new PrimeGenerator();
    	long candidate = primegen.nextPrime();
    	
    	do {
    		if (num % candidate == 0) {
    			num = num / candidate;
    			System.out.println("Found prime divisor: "+ candidate);
    		}
    		else 
    			candidate = primegen.nextPrime();
    		    		
    	} while (candidate < Math.ceil((double)num/2));
    	
    	System.out.println("Found prime divisor: "+ num);
    }

}
