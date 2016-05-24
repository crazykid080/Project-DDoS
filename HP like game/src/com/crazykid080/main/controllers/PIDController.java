package com.crazykid080.main.controllers;

import java.util.ArrayList;

import crazykid080.main.adminControls.ConsoleControl;
import crazykid080.main.adminControls.LogLevels;

public class PIDController {
	protected static ArrayList<Object> PIDs = new ArrayList<>();
	public static int RegisterProcess(Object callback){
		Object process = Callbacks.getProcess(callback);
		PIDs.add(process);
		int PIDN = PIDs.indexOf(process);
		return PIDN;
	}
	public static int getPID(Object process){
		if(PIDs.contains(process) == true){
			int PID = PIDs.indexOf(process);
			return PID;
		}else{
			ConsoleControl.write(process + " has not registed a PID!", LogLevels.Error);
		}
		return -1;
	}
}
