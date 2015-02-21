package net.nguyen;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Path;

public class SimpleFileCharacterProvider implements CharacterProvider {
	private BufferedReader br = null;

	public SimpleFileCharacterProvider(InputStream is ) throws FileNotFoundException {
		br = new BufferedReader(new InputStreamReader(is));
	}

	@Override
	public Character read() {
		if (br == null)
			return null;
		try {
			int character = br.read();
			if (character == -1) {
				br.close();
				return null;
			}
			
			return new Character((char)character);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

}
