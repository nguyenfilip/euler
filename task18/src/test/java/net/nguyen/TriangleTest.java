package net.nguyen;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleTest {

	@Test
	public void treeBuilderTest(){
		List<String> textRepresentation = Arrays.asList("3", "7 4","2 4 6");
		Node root = new TreeBuilder().buildTree(textRepresentation);
		
		Assert.assertEquals(root.getValue(), 3);
		
		Assert.assertEquals(root.getLeftChild().getValue(), 7);
		Assert.assertEquals(root.getRightChild().getValue(), 4);
		
		Assert.assertEquals(root.getLeftChild().getLeftChild().getValue(), 2);
		Assert.assertEquals(root.getLeftChild().getRightChild().getValue(), 4);
		
		Assert.assertEquals(root.getRightChild().getRightChild().getValue(), 6);
		Assert.assertEquals(root.getRightChild().getLeftChild().getValue(), 4);
		
		Assert.assertEquals(root.getLeftChild().getLeftChild().getLeftChild(), null);
		
	}
	
	@Test
	public void twoTest(){
	
	}
	
}
