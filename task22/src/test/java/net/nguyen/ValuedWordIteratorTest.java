package net.nguyen;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValuedWordIteratorTest {

	
	@Test
	public void simple1(){
		ValuedWordIterator vvi = new ValuedWordIterator(testProvider("\"CC\""));
		Assert.assertTrue(vvi.hasNext());
		Assert.assertEquals("CC",vvi.next().toString());
		Assert.assertFalse(vvi.hasNext());
	}

	@Test
	public void twoWords(){
		ValuedWordIterator vvi = new ValuedWordIterator(testProvider("\"ab\",\"xfs\",\"xrr\""));
		Assert.assertTrue(vvi.hasNext());
		Assert.assertEquals("ab",vvi.next().toString());
		Assert.assertTrue(vvi.hasNext());
		Assert.assertEquals("xfs",vvi.next().toString());
		Assert.assertTrue(vvi.hasNext());
		Assert.assertEquals("xrr",vvi.next().toString());
		Assert.assertFalse(vvi.hasNext());
	}
	
	private CharacterProvider testProvider(final String testChars) {
		return new CharacterProvider() {
			int i = 0;
			
			@Override
			public Character read() {
				if (i == testChars.length())
					return null;
				else
					return testChars.charAt(i++);
			}
			
		};
	}
}
