package net.nguyen;

import java.util.SortedSet;
import java.util.TreeSet;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CachedValueTest {

	
	@Test
	public void simple1(){
		SortedSet<ValuedWord> words = new TreeSet<ValuedWord>();
		
		ValuedWord v1 = new ValuedWord();
		v1.addChar('A');
		v1.addChar('B');
		words.add(v1);
		
		ValuedWord v2 = new ValuedWord();
		v2.addChar('A');
		v2.addChar('A');
		words.add(v2);
		
		ValuedWord v3 = new ValuedWord();
		v3.addChar('A');
		v3.addChar('C');
		words.add(v3);
		
		Assert.assertEquals(words.size(), 3);

		int i = 0;
		for(ValuedWord tested : words){
			i++;
			System.out.println(tested);
			switch (i){
				case 1: Assert.assertTrue(tested.equals(v2)); break;
				case 2: Assert.assertTrue(tested.equals(v1));break;
				case 3: Assert.assertTrue(tested.equals(v3));break;
			}
		}
		
	}
}
