package net.nguyen;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Automata {
	private String currentState = null;
	private String startState = null;
	private String finalState= null;
	private Map<String,Map<String,String>> stateToStatesViaLetter= null;;
		
	public Automata(String startState, String finalState,Set<Transition> transitionTable){
		this.startState = startState;
		this.currentState = startState;
		this.finalState = finalState;
		
		stateToStatesViaLetter = indexTransitionTable(transitionTable);
	}
	

	private Map<String, Map<String, String>> indexTransitionTable(
			Set<Transition> transitionTable) {
		
		Map<String, Map<String, String>> transitionMap =  new HashMap<String,Map<String,String>>();
		
		
		for (Transition transition : transitionTable){
			if (!transitionMap.containsKey(transition.getState1()))
				transitionMap.put(transition.getState1(), new HashMap<String,String>());
			
			Map<String,String> stateByLetter = transitionMap.get(transition.getState1());
			
			for (String letter: transition.getViaLetters()){
				if (stateByLetter.put(letter, transition.getState2()) !=null)
					throw new RuntimeException("There is already mapping from state to state");
			}
		}
		return transitionMap;
	}

	public void moveToStart() {
		currentState=startState;
	}

	public boolean isCurrentStateFinal(){
		return currentState.equals(finalState);
	}
	
	public void makeTransition(String letter){
		String newState = stateToStatesViaLetter.get(currentState).get(letter);
		if (newState == null)
			throw new RuntimeException(String.format("There is no transition from state %s via letter %s", currentState,letter));
		currentState = newState;
	}
	
}
