package net.nguyen;

import java.util.Iterator;

public class PalindromGenerator implements Iterable<Integer>{
	private int start;
	private int end;
	
	
	
	
	public PalindromGenerator(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}
	

	@Override
	public Iterator<Integer> iterator() {
		return new PalindromIterator();
	}

	private class PalindromIterator implements Iterator<Integer>{
		private int position=0;
		private Integer nextPalindrom=null;
		
		public PalindromIterator(){
			this.position=start;
			if (start > end)
				position=start+1;
			else
				position=start-	1;
			
			nextPalindrom=nextPalindrome();
		}
		
		private Integer nextPalindrome() {
			Integer result = null;
			while (position != end) {
				if (position > end)
					position--;
				else
					position++;
				
				if (isPalindrome(Integer.toString(position))){					
					result=position;
					return result;
				}
			}
			return null;
		}

		@Override
		public boolean hasNext() {
			return nextPalindrom!=null;
		}

		@Override
		public Integer next() {
			Integer result = nextPalindrom;
			nextPalindrom = nextPalindrome();
			return result;
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException("Removing palindrom not supported");
		}
		
	}

	public static boolean isPalindrome(String text) {
		if (text.length()<=1)
			return true;
		
		return text.charAt(0)==text.charAt(text.length()-1) && isPalindrome(text.substring(1,text.length()-1));
		
	}
}
