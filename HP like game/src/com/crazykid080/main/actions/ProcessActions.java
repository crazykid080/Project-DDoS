package com.crazykid080.main.actions;

import com.crazykid080.main.constructors.FileConstructor;
import com.crazykid080.main.userControl.Server;

public class ProcessActions{

	public void onProcessKill(FileConstructor obj, boolean log){

		obj.setRunning(false);

		if(log == true){
			Server s = obj.getServer();
			s.writeLog(" killed process ");
		}

	}

	public void onProcessStart(FileConstructor obj, boolean log){

	}

	public void onInstallStart(/*NEED TO CREATE THE FILES*/ int seconds){
		ProcessTimer a = new ProcessTimer(seconds);
 		a.run();
	}

}
