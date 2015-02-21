package net.nguyen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.CharBuffer;

public class Task21 {
	public static void main(String[] args) throws IOException {
		
		InputStream namesStream = Task21.class.getResourceAsStream("/p022_names.txt");
		int oneCharacter = 0;
		
		try ( BufferedReader reader = new BufferedReader(new InputStreamReader(namesStream))){
			while ((oneCharacter = reader.read()) != -1)
				System.out.println((char)oneCharacter);
		}
	}
}
