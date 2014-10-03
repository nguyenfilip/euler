package net.nguyen;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.io.FileUtils;


public class TreeBuilder {
	
	public Node buildTree(List<String> textRepresentation){
		
		Node root=null;
		LinkedList<Node> lastRow = new LinkedList<Node>();
		LinkedList<Node> newRow = new LinkedList<Node>();
		Node left = null, right = null;

		for (int i = textRepresentation.size() - 1; i >= 0; i--) {
			String[] tier = textRepresentation.get(i).split(" ");
			Node newNode = null;
			for (String s : tier) {
				left =  lastRow.isEmpty()?null:lastRow.pollFirst();
				right = lastRow.isEmpty()?null: lastRow.peekFirst();
				
				newNode = new Node(left, right, Integer.parseInt(s));
				newRow.addLast(newNode);
			}
			lastRow = newRow;
			newRow = new LinkedList<Node>();
			if (i == 0)
				return newNode;
		}
		return null;
	}
	
}
