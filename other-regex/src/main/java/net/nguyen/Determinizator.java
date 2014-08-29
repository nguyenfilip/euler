package net.nguyen;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import org.apache.commons.lang.StringUtils;

public class Determinizator {
	
	public Automata determinize(NAutomata nautomata){
		Set<Transition> ttable = new HashSet<Transition>();
		Stack<String> statesToProcess = new Stack<String>();
		statesToProcess.add("start");
		
		while (!statesToProcess.isEmpty()){
			String state = statesToProcess.pop();
			System.out.println("Looking at state "+state);
			
			for (Character c : nautomata.getAlphabet()){
				Set<String> reachableByC = nautomata.getReachableStates(state, c);
				if (reachableByC.isEmpty())
					continue;
				
				String newState = createStateForSet(reachableByC);
				System.out.println("State reachable from this state:" +newState);
				statesToProcess.add(newState);
				ttable.add (new Transition(state, newState, Collections.singleton(c)));
			}
		}
		
		return new Automata(ttable);
	}

	
	private String createStateForSet(Set<String> reachableByC) {
		boolean shouldBeEnd = false;
		String[] items = reachableByC.toArray(new String[]{});
		for (int i = 0; i<items.length;i++)
			if (items[i].endsWith("end")){
				shouldBeEnd=true;
				items[i] = items[i].substring(0, items[i].length()-3);
			}
		Arrays.sort(items);
		return StringUtils.join(items)+(shouldBeEnd?"-end":"");
		
	}
}
