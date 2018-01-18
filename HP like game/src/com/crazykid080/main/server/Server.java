package com.crazykid080.main.server;

import com.crazykid080.main.ip.IP;
import com.crazykid080.main.ip.IPList;

public class Server {
	protected String CurrentIP = "ERROR";

	public Server() {
		generateIP();
		System.out.println(CurrentIP);
	}
	public Server(String IP) {
		if(SetIP(IP) == false) {
			System.out.println("(Server)-Warning: Set IP is NOT valid, falling back to randomly generated IP.");
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
