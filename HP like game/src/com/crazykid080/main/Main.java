package com.crazykid080.main;

import com.crazykid080.main.threads.BurnoutTimer;
import com.crazykid080.main.threads.CoreTimer;
import com.crazykid080.main.userControl.Core;
import com.crazykid080.main.userControl.Server;

import crazykid080.main.adminControls.AdminConsole;
import crazykid080.main.adminControls.ConsoleControl;

public class Main {
	
	static CoreTimer timer = null;

	@SuppressWarnings("unused")
	synchronized public static void main(String[] args) {
		AdminConsole bleh = new AdminConsole();
		Server serverMain = new Server(1);
		timer = new CoreTimer(10);
		for (int i = 0; i < 10; i++) {
			Core core = new Core();
		}
		timer.run();
		BurnoutTimer timer2 = new BurnoutTimer();
		timer2.run();

	}
	
	synchronized public static CoreTimer getCoreTimer(){
		return timer;
	}
	
	public static void notAdded(){
		ConsoleControl.write("This is something that hasn't been implemented, sorry!", crazykid080.main.adminControls.LogLevels.Warning);
	}

}
