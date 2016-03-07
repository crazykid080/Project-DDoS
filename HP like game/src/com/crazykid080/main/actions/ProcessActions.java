package com.crazykid080.main.actions;

import com.crazykid080.main.constructors.FileConstructor;
import com.crazykid080.main.threads.ProcessTimer;
import com.crazykid080.main.userControl.Server;

public class ProcessActions{

	public void onProcessKill(FileConstructor obj, boolean log){
		//TODO: create logic to check for encryption!
		if(true){
			obj.setRunning(false);
		}

		if(log == true){
			Server s = obj.getServer();
			s.writeLog(" killed process ");
		}

	}

	public void onProcessStart(FileConstructor obj, boolean log){
		obj.setRunning(true);
		if(log == true){
			Server s = obj.getServer();
			s.writeLog(" started process ");
		}

	}

	public void onInstallStart(/*NEED TO CREATE THE FILES*/ int seconds){
		ProcessTimer a = new ProcessTimer(seconds);
		a.run();
	}

}
