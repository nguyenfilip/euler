package net.nguyen;

import java.util.Iterator;

public class ValuedWordIterator implements Iterable<ValuedWord>,Iterator<ValuedWord> {
	private CharacterProvider characterProvider = null;
	
	public ValuedWordIterator(CharacterProvider characterProvider) {
		this.characterProvider = characterProvider; 
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ValuedWord next() {
		Character c=null;
		
		while ((c = characterProvider.read()) != null){
			
		}
	}
	
	@Override
	public Iterator<ValuedWord> iterator() {
		return this;
	}

	
}
