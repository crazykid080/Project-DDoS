package com.crazykid080.main.UI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {
	private JPanel panel1 = new JPanel();

	private JButton buttonLogs = new JButton();
	private JButton buttonDrivers = new JButton();
	private JButton buttonFilesProg = new JButton();
	private JButton buttonRunning = new JButton();

	public MainFrame(){
		this.setTitle("Main");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setSize(100, 100);

		buttonLogs = new JButton("Logs");
		buttonDrivers = new JButton("Drivers");
		buttonFilesProg = new JButton("Files/Programs");
		buttonRunning = new JButton("Running");

		buttonLogs.addActionListener(e -> buttonLogsClick());
		buttonDrivers.addActionListener(e -> buttonDriversClick());
		buttonFilesProg.addActionListener(e -> buttonFilesProgClick());
		buttonRunning.addActionListener(e -> buttonRunningClick());
		
		panel1.add(buttonLogs);
		panel1.add(buttonDrivers);
		panel1.add(buttonFilesProg);
		panel1.add(buttonRunning);

		this.add(panel1);
	}

	private void buttonRunningClick() {
		
	}

	private void buttonFilesProgClick() {
		
	}

	private void buttonDriversClick() {

	}

	private void buttonLogsClick() {

	}
}
