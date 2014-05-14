package net.nguyen;

import java.util.Set;


public class Transition {
	private String state1;
	private String state2;
	private Set<String> viaLetters;
	
	public Transition(String state1, String state2, Set<String> viaLetters) {
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


	public Set<String> getViaLetters() {
		return viaLetters;
	}


	public static Set<String> createLetterSet(String ... letters ){
		return null;
	}
}
