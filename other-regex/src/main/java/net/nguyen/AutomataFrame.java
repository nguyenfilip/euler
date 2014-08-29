package net.nguyen;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import org.testng.reporters.jq.Main;

public class AutomataFrame extends Frame {
	private Automata automata = null;
	
	public AutomataFrame(Automata automata) {
		super("Automata");
		this.automata=automata;
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
			
		});
		setSize(1000,1000);
		setVisible(true);
		
	}

	@Override
	public void paint(Graphics g1) {
		Graphics2D g2= (Graphics2D)g1;
		RenderingHints rh = new RenderingHints(
	             RenderingHints.KEY_ANTIALIASING,
	             RenderingHints.VALUE_ANTIALIAS_ON);
	    g2.setRenderingHints(rh);
//	    automata.getGraphToDraw();
	    
	}
	

}
