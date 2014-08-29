package net.nguyen;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddUpTest {

	@Test
	public void simpleAddUp(){
		Assert.assertEquals(App.addUp(createLines("1","9")),"10");
	}
	
	@Test
	public void test22(){
		Assert.assertEquals(App.addUp(createLines("10","12")),"22");
	}
	
	
	@Test
	public void simpleAddUp1(){
		Assert.assertEquals(App.addUp(createLines("10","99")),"109");
		
		Assert.assertEquals(App.addUp(createLines("19","23","10","12")),"64");
	}

	
	private List<String> createLines(String ... text) {
		return Arrays.asList(text);
	}
}
