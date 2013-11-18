package lab7;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelSwitcherController implements ActionListener {
	
	private PanelSwitcherView view;
	private PanelSwitcherModel model;

	public PanelSwitcherController(PanelSwitcherView view, PanelSwitcherModel model){
		this.view = view;
		this.model = model;
	}
	/**
	 * switch panels when an event happens
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int temp = 0;
		this.model.switchPanel();
		temp = this.model.whichPanel();
		this.view.displayPanel(temp);
	}
	
}
