package com.crazykid080.main.UI;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.crazykid080.main.userControl.Server;

@SuppressWarnings("serial")
public class DriverFrame extends JFrame{

	@SuppressWarnings("unused")
	private JPanel panel1 = new JPanel();


	//---------- Swing components above, non swing below

	protected Server parent = null;

	public DriverFrame(){

	}

	public DriverFrame(Server parent){

		//TODO: add code from other UI that has the variable size

		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setVisible(true);

		this.parent = parent;

	}

}
