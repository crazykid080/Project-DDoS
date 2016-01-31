package com.crazykid080.main.adminControls;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class AdminConsole extends JFrame {
	private String consoleOut = "";
	private String consoleIn = "";
	private JPanel panel1 = new JPanel();
	private JPanel panel2 = new JPanel();
	private JTextField field1 = new JTextField();
	private JButton buttonDone = new JButton();
	private JButton buttonClear = new JButton();
	private JTextArea textArea1 = new JTextArea();
	public AdminConsole(){

		this.setTitle("Admin Console");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocationRelativeTo(null);

		buttonDone = new JButton("Done");
		buttonClear = new JButton("Clear");


		buttonDone.addActionListener(e -> buttonDoneClick());

		buttonClear.addActionListener(e -> buttonClearClick());

		panel1.add(textArea1);

		panel2.add(field1);
		panel2.add(buttonClear);
		panel2.add(buttonDone);

		Dimension field = new Dimension(200, 25);

		KeyListener keyListener = new KeyListener() {
			public void keyPressed(KeyEvent keyEvent) {
				//keyPressAction(keyEvent);
			}
			public void keyReleased(KeyEvent keyEvent) {
				keyPressAction(keyEvent);
			}
			public void keyTyped(KeyEvent keyEvent) {
				//keyPressAction(keyEvent);
			}
		};

		field1.setPreferredSize(field);
		field1.setFocusable(true);
		field1.addKeyListener(keyListener);
		
		Dimension area = new Dimension(375, 300);
		textArea1.setPreferredSize(area);

		this.add(panel1, BorderLayout.NORTH);
		panel1.setVisible(true);

		this.add(panel2, BorderLayout.SOUTH);
		panel2.setVisible(true);

		Dimension d = new Dimension(400, 400);
		this.setPreferredSize(d);

		ConsoleControl.registerConsole(this);

		this.pack();
		ConsoleControl.write("Console initialized.", LogLevels.Info);
	}
	private void buttonClearClick() {
		field1.setText("");
		textArea1.setText("");
	}
	private void buttonDoneClick() {
		consoleIn = field1.getText();
		AdminCommandController.runCommand(consoleIn);
		field1.setText("");
	}
	public void write(String text){
		consoleOut = textArea1.getText() + text;
		textArea1.setText(consoleOut);
	}
	
	private void keyPressAction(KeyEvent key){
		if(key.getKeyChar() == KeyEvent.VK_ENTER){
			buttonDoneClick();
		}
	}
	
	/**
	 * @author Crazykid080
	 * 
	 * @param text The message you wish to send
	 * @param type The alert level the message will be.
	 */
	public void write(String text, LogLevels type){
		String level = "ISSUE!!!";
		switch(type){
		case Info:
			level = "[Info]";
			break;
		case CRITICAL:
			level = "[***CRITICAL***]";
			break;
		case Error:
			level = "[*Error*]";
			break;
		case Warning:
			level = "[Warning!]";
			break;
		default:
			level = "ISSUE!!!";
			break;
		}
		consoleOut = textArea1.getText() + level + " " + text;
		textArea1.setText(consoleOut);
	}
}
