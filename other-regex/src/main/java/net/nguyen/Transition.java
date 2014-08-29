package net.nguyen;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Transition {
	private String state1;
	private String state2;
	private Set<Character> viaLetters;
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((state1 == null) ? 0 : state1.hashCode());
		result = prime * result + ((state2 == null) ? 0 : state2.hashCode());
		result = prime * result
				+ ((viaLetters == null) ? 0 : viaLetters.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transition other = (Transition) obj;
		if (state1 == null) {
			if (other.state1 != null)
				return false;
		} else if (!state1.equals(other.state1))
			return false;
		if (state2 == null) {
			if (other.state2 != null)
				return false;
		} else if (!state2.equals(other.state2))
			return false;
		if (viaLetters == null) {
			if (other.viaLetters != null)
				return false;
		} else if (!viaLetters.equals(other.viaLetters))
			return false;
		return true;
	}


	public Transition(String state1, String state2, Set<Character> viaLetters) {
		super();
		this.state1 = state1;
		this.state2 = state2;
		this.viaLetters = viaLetters;
	}
	

	public String getState1() {
		return state1;
	}


	public String getState2() {
		return state2;
	}


	public Set<Character> getViaLetters() {
		return viaLetters;
	}


	public static Set<Character> createLetterSet(Character ... letters ){
		return new HashSet<Character>(Arrays.asList(letters));
	}
}
