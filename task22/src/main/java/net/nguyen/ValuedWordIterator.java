package net.nguyen;

import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ValuedWordIterator implements Iterable<ValuedWord>,Iterator<ValuedWord> {
	private CharacterProvider characterProvider = null;
	private boolean hasNext = true;
	
	public ValuedWordIterator(CharacterProvider characterProvider) {
		this.characterProvider = characterProvider;
		//Skip to first "
		readUntilQuote();
	}
	
	public Stream<ValuedWord> stream(){
		return StreamSupport.stream(this.spliterator(), false);
	}
	
	private String readUntilQuote() {
		StringBuffer sb = new StringBuffer();
		Character c =characterProvider.read();
		if (c == null) {
			hasNext = false;
			return null;
		}
			
		while (c !=  '"' ) {
			sb.append(c);
			c = characterProvider.read();
		}
		
		return sb.toString();
	}

	@Override
	public boolean hasNext() {
		return hasNext;
	}

	@Override
	public ValuedWord next() {
		String word = readUntilQuote();
		readUntilQuote();
		return ValuedWord.fromString(word);
	}
	
	@Override
	public Iterator<ValuedWord> iterator() {
		return this;
	}

	
}
