package com.crazykid080.main.UI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.crazykid080.main.adminControls.ConsoleControl;
import com.crazykid080.main.adminControls.LogLevels;

@SuppressWarnings("serial")
public class MainFrame extends JFrame {
	private JPanel panel1 = new JPanel();

	private JButton buttonLogs = new JButton();
	private JButton buttonDrivers = new JButton();
	private JTextField IPAddress = new JTextField();
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

		String ActiveIP = "PLACEHOLDER";
		ConsoleControl.write("The active IP is: " + ActiveIP , LogLevels.Info);
		IPAddress.setText(ActiveIP);


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
		//new UI for running processes
	}

	private void buttonFilesProgClick() {
		//new UI for files 
	}

	private void buttonDriversClick() {
		//new UI for drivers
	}

	@SuppressWarnings("unused")
	private void buttonLogsClick() {
		//new UI for logs
		LogFrame log = new LogFrame();
	}
}
