package com.crazykid080.main.userControl;

import com.crazykid080.main.controllers.IPController;
import com.crazykid080.main.userControl.Server;

public class Core extends Server{

	public int subCoreNum =-1;
	protected boolean isMainCore = false;

	public Core() {
		isMainCore = true;
		subCoreNum = 0;
		IPAddress = IPController.obtainIP(this);
		Core core1 = new Core(this);
		Core core2 = new Core(this);
		Core core3 = new Core(this);

	}

	public Core(Core parent){

		int num = parent.getsubCoreNum();
		subCoreNum = num + 1;
		IPAddress = IPController.obtainIP(this);

	}



	//getters and setters below

	public int getsubCoreNum(){
		return subCoreNum;
	}

}
