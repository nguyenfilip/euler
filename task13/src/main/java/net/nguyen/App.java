package net.nguyen;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) throws IOException {
		List<String> lines = FileUtils.readLines(new File("input.txt"));
		
		System.out.println(addUp(lines).substring(0,10));
		
		
	}

	public static String addUp(List<String> lines) {
		int toLeft = 0;
		StringBuilder result = new StringBuilder();
		
		int position = lines.get(0).length();
		
		while (position > 0 ){
			position--;
			
			for (String num : lines)
				toLeft += Integer.parseInt(""+num.charAt(position));
			
			result.insert(0, toLeft % 10);
			toLeft /=10;
		}
		if (toLeft != 0)
			result.insert(0, toLeft);
		return result.toString();
	}

}
