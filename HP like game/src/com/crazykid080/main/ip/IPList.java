package com.crazykid080.main.ip;

import java.util.ArrayList;

public class IPList {
	private static ArrayList<String> RegisteredIPs = new ArrayList<String>();

	public static boolean registerIP(String IP){
		if(RegisteredIPs.contains(IP)) {
			return false;
		}else {
			RegisteredIPs.add(IP);
			return true;
		}
	}

	public static ArrayList<String> getRegisteredIPs() {
		return RegisteredIPs;
	}
	
}
