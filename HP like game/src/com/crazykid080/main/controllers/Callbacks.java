package com.crazykid080.main.controllers;

import java.util.ArrayList;

import com.crazykid080.main.constructors.FileConstructor;
import com.crazykid080.main.processes.ProcessTypes;

import crazykid080.main.adminControls.ConsoleControl;

public class Callbacks {
	@SuppressWarnings("rawtypes")
	public static ArrayList CBProcesses = new ArrayList();
	@SuppressWarnings("unchecked")
	public static void RegisterProcess(Object Hashcode){
		//ConsoleControl.write("Adding code: "+Hashcode);
		CBProcesses.add(Hashcode);
	}
	public void unRegisterProcess(Object Hashcode){
		CBProcesses.remove(Hashcode);
	}

	@SuppressWarnings("unchecked")
	public static ArrayList<Object> getCallbacks(){
		//ConsoleControl.write("Returning callbacks.");
		return CBProcesses;
	}
	public static Object getProcess(ProcessTypes type, double version, double burnout){
		for (Object object : CBProcesses) {
			if(((FileConstructor)object).getType() == type && 
					((FileConstructor)object).version == version &&
					((FileConstructor)object).burnout == burnout){
				return object;
			}
		}
		ConsoleControl.write("ERROR: no vaild process that is of type: " + type + " , "
				+ "version of: " + version + " , and burnout of: " + burnout + 
				" was found.");
		return null;
	}
	public static Object getProcess(Object callback){
		for (Object object : CBProcesses) {
			if(object ==  callback){
				return object;
			}
		}
		ConsoleControl.write("ERROR: " + callback + " was not found as a registered object!");
		return null;
	}
}
