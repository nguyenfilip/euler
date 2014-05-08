package net.nguyen;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int limit  = 4000000;
    	int previous=1;
    	int current = 2;
    	int sum =0 ;
    	
    	while (current <= limit){
    		if (current % 2 == 0)
    			sum+=current;
    		int x = current;
    		current = previous+current;
    		previous = x;    		
    	}
    	System.out.println(sum);
    }
}
