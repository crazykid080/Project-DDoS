package com.crazykid080.main.files;

import com.crazykid080.main.adminControls.ConsoleControl;
import com.crazykid080.main.adminControls.LogLevels;
import com.crazykid080.main.processes.ProcessTypes;
import com.crazykid080.main.userControl.Server;

//TODO: move this to a new package
public class FileConstructor{

	//TODO: add file ID controller
	//TODO: add file type enum
	String publicName = "ERROR!!!";
	@SuppressWarnings("unused")
	private Server parent = null;
	protected double burnout = -1;
	public double version = -1;

	public FileConstructor(ProcessTypes type, double vers, Server parent){

		this.burnout = 0;
		this.version = vers;
		this.parent = parent;

		publicName = type + " (" + burnout + " ) " + version;

	}

	public void doResearch(int hours){

		if(version >= 10){
			double addition = hours * .01;
			ConsoleControl.write("research will add; " + addition, LogLevels.Info);
		}else{
			double addition = hours * .001 / 2;
			ConsoleControl.write("research will add; " + addition, LogLevels.Info);
		}

	}

}
