package net.nguyen;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductTest {
	
	@Test 
	public void simpleTest(){
		Assert.assertEquals(App.product("1111"), 1);
		Assert.assertEquals(App.product("1211"), 2);
		Assert.assertEquals(App.product("2222"), 16);
		Assert.assertEquals(App.product("2220"), 0);
	}
	
}
