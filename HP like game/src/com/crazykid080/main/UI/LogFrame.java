package com.crazykid080.main.UI;

import javax.swing.*;


public class LogFrame extends JFrame{

private JPanel panel1 = new JPanel();
private JTextArea textArea1 = new JTextArea();
private JButton done = new JButton();

//TODO: Figure out if I need this!
private ArrayList<String> Logs = new ArrayList<String>();

public LogFrame(){

//normal code here

//functional code here
done = new JButton("Done");

done.addActionListener(e -> buttonDoneClick());

//textArea1.setEditable(false);

panel1.add(textArea1);

this.add(panel1);

}
//private methods

private void buttonDoneClick(){
String logEdit = textArea1.getText();
textArea1.setText(logEdit);
}

//getters and setters?

//public methods

public void addLog(String log){
textArea1.setText(textArea1.getText() + log + "\n");
}

}
