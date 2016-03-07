package com.crazykid080.main.controllers;

import java.util.ArrayList;

import com.crazykid080.main.adminControls.ConsoleControl;
import com.crazykid080.main.adminControls.LogLevels;
import com.crazykid080.main.userControl.Server;

public class LogController{

	//TODO: should I overhaul this later?
	//this may be very inefficient and deadly for computer speed!

	protected String logFile = "ERROR!!";
	protected Server owner = null;

	protected ArrayList<Object> listeners = new ArrayList<Object>();

	public LogController(Server owner){
		listeners = new ArrayList<Object>();

		logFile = "";

	}

	//actions

	public void addLog(String text){

		String tmpLF = logFile;
		logFile = tmpLF + "\n" + text;
		notifyListeners();

	}

	protected void notifyListeners(){

		if(listeners.isEmpty()){
			return;
		}

		for(Object obj : listeners){
			String name = obj.getClass().getName();
			if(name.equalsIgnoreCase("Server")){
				//code here
			}
		}
	}

	public boolean registerLogListener(Object obj){

		if(listeners.contains(obj)){
			return true;
		}

		listeners.add(obj);
		if(listeners.contains(obj)){
			return true;
		}else{
			ConsoleControl.write("Class: LogController, Object " + obj + "could not be added to the listeners ArrayList!", LogLevels.Error);
			return false;
		}
	}


	//getters below

	public String getLogFile(){
		return logFile;
	}

	public LogController getObject(){
		return this;
	}

}
