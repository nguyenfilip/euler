package net.nguyen;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CharHelperTest {

	
	@Test
	public void simple1(){
		Assert.assertEquals(CharHelper.alphaValue('C'), 3);
	}
}
