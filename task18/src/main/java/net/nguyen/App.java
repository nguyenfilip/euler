package net.nguyen;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import org.apache.commons.io.FileUtils;

/**
 * Hello world!
 * 
 */
public class App {
	private static Node root = null;

	public static void main(String[] args) throws Exception {
		List<String> lines = FileUtils.readLines(new File("input.txt"));
		root = new TreeBuilder().buildTree(lines);
		System.out.println(new FullWalkerBiggestSum().biggestSum(root));
	}

	private static void printTree(Node root) {
		
	}

}
