package com.crazykid080.main.UI;

import javax.swing.*;


public class LogFrame extends JFrame{

private JPanel panel1 = new JPanel();
private JTextArea textArea1 = new JTextArea();
private ArrayList<String> Logs = new ArrayList<String>();

public LogFrame(){

//normal code here

//functional code here

textArea1.setEditable(false);

panel1.add(textArea1);

this.add(panel1);

}

//getters and setters?

//public methods

public void addLog(String log){
textArea1.setText(textArea1.getText() + log + "\n");
}

}
