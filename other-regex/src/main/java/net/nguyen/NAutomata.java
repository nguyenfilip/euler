package net.nguyen;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NAutomata {
	private Map<String, Map<Character, Set<String>>> stateToStatesViaLetter = null;;
	private Set<Character> alphabet = new HashSet<Character>();
	
	public NAutomata(Set<Transition> transitionTable) {
		stateToStatesViaLetter = indexTransitionTable(transitionTable);
	}

	private Map<String, Map<Character, Set<String>>> indexTransitionTable(
			Set<Transition> transitionTable) {

		Map<String, Map<Character, Set<String>>> transitionMap = new HashMap<String, Map<Character, Set<String>>>();

		for (Transition transition : transitionTable) {
			
			if (!transitionMap.containsKey(transition.getState1()))
				transitionMap.put(transition.getState1(),
						new HashMap<Character, Set<String>>());

			Map<Character, Set<String>> stateByLetter = transitionMap.get(transition
					.getState1());

			for (Character letter : transition.getViaLetters()) {
				alphabet.add(letter);
				if (!stateByLetter.containsKey(letter))
					stateByLetter.put(letter, new HashSet<String>());
				
				stateByLetter.get(letter).add(transition.getState2());
			}
		}
		return transitionMap;
	}
	
	public Set<String> getReachableStates(String from, Character via){
		if (!stateToStatesViaLetter.containsKey(from))
			return Collections.EMPTY_SET;
		
		if (!stateToStatesViaLetter.get(from).containsKey(via))
			return Collections.EMPTY_SET;;
		
		return stateToStatesViaLetter.get(from).get(via);
			
	}

	public Set<Character> getAlphabet() {
		return Collections.unmodifiableSet(alphabet);
	}
}
