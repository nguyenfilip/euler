package net.nguyen;

import java.util.HashSet;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AutomataTest {

	@Test
	public void simpleAutomata(){
		Set<Transition> ttable = new HashSet<Transition>();
		ttable.add(new Transition("start", "s2", Transition.createLetterSet('a')));
		ttable.add(new Transition("s2", "s3", Transition.createLetterSet('a')));
		ttable.add(new Transition("s3", "s4-end", Transition.createLetterSet('b')));
		Automata autom = new Automata(ttable);
		
		Assert.assertFalse(autom.isCurrentStateFinal());
		autom.runWord("aab");
		Assert.assertTrue(autom.isCurrentStateFinal());
		autom.moveToStart();
		autom.runWord("aa");
		Assert.assertFalse(autom.isCurrentStateFinal());
	}
	
	@Test
	public void simpleNAutomata(){
		Set<Transition> ttable = new HashSet<Transition>();
		ttable.add(new Transition("start", "s2", Transition.createLetterSet('a')));
		ttable.add(new Transition("start", "s3", Transition.createLetterSet('a')));
		ttable.add(new Transition("s2", "s3", Transition.createLetterSet('a')));
		ttable.add(new Transition("s3", "s4-end", Transition.createLetterSet('b')));
		NAutomata autom = new NAutomata(ttable);
		
		Assert.assertEquals(autom.getReachableStates("start", 'a').size(), 2);
		Assert.assertTrue(autom.getReachableStates("start", 'a').contains("s2"));
		Assert.assertTrue(autom.getReachableStates("start", 'a').contains("s3"));
		
		Assert.assertEquals(autom.getReachableStates("s2", 'a').size(), 1);
		Assert.assertTrue(autom.getReachableStates("s2", 'a').contains("s3"));
		
		Assert.assertEquals(autom.getReachableStates("s3", 'b').size(), 1);
		Assert.assertTrue(autom.getReachableStates("s3", 'b').contains("s4-end"));
		Assert.assertFalse(autom.getReachableStates("s3", 'a').contains("s4-end"));
		

		Assert.assertEquals(autom.getAlphabet().size(), 2);
		Assert.assertTrue(autom.getAlphabet().contains('a'));
		Assert.assertTrue(autom.getAlphabet().contains('b'));
		
		
	}
}
