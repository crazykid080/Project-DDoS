package com.crazykid080.main;

import java.util.ArrayList;

import com.crazykid080.main.adminControls.AdminConsoleExt;
import com.crazykid080.main.ip.IPList;
import com.crazykid080.main.server.Server;

import com.crazykid080.main.adminControls.ConsoleControlExt;
import com.crazykid080.main.adminControls.LogLevelsExt;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		AdminConsoleExt MainConsole = new AdminConsoleExt();
		Server X = new Server("127.0.0.1");
		
		ArrayList<String> x = IPList.getRegisteredIPs();
		for (String string : x) {
			ConsoleControlExt.write(string, LogLevelsExt.Info);
		}
	}

	public static void notAdded(){
		ConsoleControlExt.write("This is something that hasn't been implemented, sorry!", LogLevelsExt.Warning);
	}

}
