package com.crazykid080.main.userControl;

import com.crazykid080.main.adminControls.ConsoleControl;
import com.crazykid080.main.controllers.IPController;
import com.crazykid080.main.threads.ProcessTimer;
import com.crazykid080.main.userControl.Server;

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
		runTimer();
	}

	public Core(Core parent){
		int num = parent.getsubCoreNum();
		subCoreNum = num + 1;
		IPAddress = IPController.obtainIP(this);
		runTimer();
	}
	
	private void runTimer(){
		ProcessTimer timer = new ProcessTimer(30, this);
		timer.run();
		ConsoleControl.write("Test");
	}

	//getters and setters below

	public int getsubCoreNum(){
		return subCoreNum;
	}
	
	@SuppressWarnings("unused")
	public void onProcessComplete(){
		ConsoleControl.write("Triggered");
		Core core = new Core(this);
	}

}
