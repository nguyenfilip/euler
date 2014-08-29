package net.nguyen;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Automata {
	private String currentState = null;
	private Map<String, Map<Character, String>> stateToStatesViaLetter = null;;
	
	public Automata(Set<Transition> transitionTable) {

		this.currentState = "start";

		stateToStatesViaLetter = indexTransitionTable(transitionTable);
	}

	private Map<String, Map<Character, String>> indexTransitionTable(
			Set<Transition> transitionTable) {

		Map<String, Map<Character, String>> transitionMap = new HashMap<String, Map<Character, String>>();

		for (Transition transition : transitionTable) {
			
			if (!transitionMap.containsKey(transition.getState1()))
				transitionMap.put(transition.getState1(),
						new HashMap<Character, String>());

			Map<Character, String> stateByLetter = transitionMap.get(transition
					.getState1());

			for (Character letter : transition.getViaLetters()) {
				if (stateByLetter.put(letter, transition.getState2()) != null)
					throw new RuntimeException(
							"There is already mapping from state to state");
			}
		}
		return transitionMap;
	}

	public void moveToStart() {
		currentState = "start";
	}

	public boolean isCurrentStateFinal() {
		return currentState.endsWith("end");
	}

	public void makeTransition(char letter) {
		String newState = stateToStatesViaLetter.get(currentState).get(letter);
		if (newState == null)
			return;
		currentState = newState;
	}

	public void runWord(String string) {
		for (int i = 0; i < string.length(); i++)
			makeTransition(string.charAt(i));
	}
	
}
