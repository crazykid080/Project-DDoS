package com.crazykid080.main;

import java.util.ArrayList;

import com.crazykid080.main.ip.IPList;
import com.crazykid080.main.server.Server;

import crazykid080.main.adminControls.ConsoleControl;

public class Main {

	public static void main(String[] args) {
		Server X = new Server("127.0.0.1");

		ArrayList<String> x = IPList.getRegisteredIPs();

		System.out.println(x);
	}

	public static void notAdded(){
		ConsoleControl.write("This is something that hasn't been implemented, sorry!", crazykid080.main.adminControls.LogLevels.Warning);
	}

}
