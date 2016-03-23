package com.crazykid080.main.files;

import com.crazykid080.main.adminControls.ConsoleControl;
import com.crazykid080.main.adminControls.LogLevels;
import com.crazykid080.main.userControl.Server;

//TODO: move this to a new package
public class FileConstructor{

	//TODO: add file ID controller
	protected FileTypes type = null;
	String publicName = "ERROR!!!";
	@SuppressWarnings("unused")
	private Server parent = null;
	protected double burnout = -1;
	public double version = -1;
	protected double burnoutEffect = 1000;
	protected double burnoutCap = 0;

	public FileConstructor(FileTypes type, double vers, Server parent){
		this.burnoutEffect = 1;
		this.burnoutCap = vers * 1000;
		this.burnout = 0;
		this.version = vers;
		this.parent = parent;
		this.type = type;

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

	public void onBurnoutTick(){

		if(type == FileTypes.Burnout_Capacitor){
			return;
		} else {
			addBurnout (burnoutEffect * .01);
		}

	}

	public void addBurnout(double burn){
		burnout += burn;
	}

	public void checkBurnout(){

		if(burnout >= burnoutCap ){
			//TODO: Do something!
		}


	}


}
