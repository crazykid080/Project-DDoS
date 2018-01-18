package com.crazykid080.main;

import java.util.ArrayList;

import com.crazykid080.main.adminControls.AdminConsole;
import com.crazykid080.main.ip.IPList;
import com.crazykid080.main.server.Server;

import com.crazykid080.main.adminControls.ConsoleControl;
import com.crazykid080.main.adminControls.LogLevels;

public class Main {

	public static void main(String[] args) {
		AdminConsole Main = new AdminConsole();
		Server X = new Server("127.0.0.1");
		Server Y = new Server();

		ArrayList<String> x = IPList.getRegisteredIPs();

		System.out.println(x);
	}

	public static void notAdded(){
		ConsoleControl.write("This is something that hasn't been implemented, sorry!", LogLevels.Warning);
	}

}
