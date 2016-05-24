package com.crazykid080.main.userControl;

import com.crazykid080.main.Main;
import com.crazykid080.main.controllers.IPController;
import com.crazykid080.main.threads.CoreTimer;

import crazykid080.main.adminControls.ConsoleControl;
import crazykid080.main.adminControls.LogLevels;

public class Core extends Server{

	public int subCoreNum =-1;
	protected boolean isMainCore = false;

	@SuppressWarnings("unused")
	public Core() {
		isMainCore = true;
		subCoreNum = 0;
		IPAddress = IPController.obtainIP(this);
		Core core1 = new Core(this);
		Core core2 = new Core(this);
		Core core3 = new Core(this);
		CoreTimer timer = Main.getCoreTimer();
		timer.addCore(this);
	}

	public Core(Core parent){
		int num = parent.getsubCoreNum();
		subCoreNum = num + 1;
		IPAddress = IPController.obtainIP(this);
		CoreTimer timer = Main.getCoreTimer();
		timer.addCore(this);
	}
	
	//getters and setters below

	public int getsubCoreNum(){
		return subCoreNum;
	}
	
	@SuppressWarnings("unused")
	synchronized public void onProcessComplete(){
		ConsoleControl.write("Triggered", LogLevels.Info);
		Core core = new Core(this);
	}

}
