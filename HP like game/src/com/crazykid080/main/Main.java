package com.crazykid080.main;

import com.crazykid080.main.adminControls.AdminConsole;
import com.crazykid080.main.adminControls.ConsoleControl;
import com.crazykid080.main.adminControls.LogLevels;
import com.crazykid080.main.threads.BurnoutTimer;
import com.crazykid080.main.userControl.Core;
import com.crazykid080.main.userControl.Server;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		AdminConsole bleh = new AdminConsole();
		Server serverMain = new Server(1);
		for (int i = 0; i < 10; i++) {
			ConsoleControl.write(i);
			Core core = new Core();
		}
		BurnoutTimer timer = new BurnoutTimer();
		timer.run();

	}

	public static void notAdded(){
		ConsoleControl.write("This is something that hasn't been implemented, sorry!", LogLevels.Warning);
	}

}
