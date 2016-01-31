package com.crazykid080.main;

import com.crazykid080.main.adminControls.AdminConsole;
import com.crazykid080.main.adminControls.ConsoleControl;
import com.crazykid080.main.threads.BurnoutTimer;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		AdminConsole bleh = new AdminConsole();
		Server serverMain = new Server(1);
		//ProcessCreator.CreateProcess(ProcessTypes.Firewall_Protect, 1, 0);
		//ConstructorTest test = new ConstructorTest(4.3, 0, ProcessTypes.Firewall_Protect);
		//ProcessCreator.CreateProcess(ProcessTypes.Password_Protect, 1, 50);
		BurnoutTimer timer = new BurnoutTimer();
		timer.run();
		
	}
	
	public static void notAdded(){
		ConsoleControl.write("This is something that hasn't been implemented, sorry!");
	}

}
