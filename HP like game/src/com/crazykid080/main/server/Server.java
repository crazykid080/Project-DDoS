package com.crazykid080.main.server;

import com.crazykid080.main.ip.IP;
import com.crazykid080.main.ip.IPList;

import crazykid080.main.adminControls.ConsoleControl;
import crazykid080.main.adminControls.LogLevels;

public class Server {
	protected String CurrentIP = "ERROR";

	public Server() {
		generateIP();
		ConsoleControl.write(CurrentIP);
	}
	public Server(String IP) {
		if(SetIP(IP) == false) {
			ConsoleControl.write("(Server): Set IP is NOT valid, falling back to randomly generated IP.", LogLevels.Warning);
			generateIP();
		}
	}

	public boolean SetIP(String Ip) {
		if(CurrentIP == Ip) {
			return false;
		}
		if(IPList.registerIP(Ip)) {
			CurrentIP = Ip;
			return true;
		} else {
			return false;
		}
	}

	protected void generateIP() {
		String tmp = IP.obtainIP();
		CurrentIP = tmp;
	}
}
