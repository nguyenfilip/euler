package net.nguyen;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NAutomata {
	private Map<String,Map<String,Set<String>>> stateToStatesViaLetters = new HashMap<String,Map<String,Set<String>>>();
	
	public NAutomata(String start, String end, Set<Transition> transitionTable){
		
	}
	
	public Set<String> toWhichStates(String startState, Set<String> letters){
		//return stateToStatesViaWords.get(startState).get(for each word in words);
		return null;
	}
	
}
