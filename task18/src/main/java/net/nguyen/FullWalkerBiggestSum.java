package net.nguyen;

public class FullWalkerBiggestSum {

	public int biggestSum(Node node){
		if (node.getLeftChild()==null )
			return node.getValue();
		
		return Math.max(node.getValue() + biggestSum(node.getLeftChild()),node.getValue()+biggestSum(node.getRightChild())); 
	}
}
