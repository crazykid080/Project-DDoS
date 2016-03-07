package com.crazykid080.main.threads;

import java.util.ArrayList;

import com.crazykid080.main.constructors.FileConstructor;
import com.crazykid080.main.controllers.ServerController;
import com.crazykid080.main.userControl.Server;

public class BurnoutTimer implements Runnable {
	public BurnoutTimer() {

	}

	@Override
	public synchronized void run() {
		while(true){
			try {
				//this.wait(900000);
				this.wait(5000);
				ArrayList<Object> servers = ServerController.getAllServers();
				for (Object object : servers) {
					ArrayList<Object> processes = ((Server)object).getProcesses();
					for (Object object2 : processes) {
						((FileConstructor)object2).onBurnoutTick();
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
