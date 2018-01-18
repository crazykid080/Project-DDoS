package com.crazykid080.main.ip;

import java.util.Random;

import crazykid080.main.adminControls.ConsoleControl;
import crazykid080.main.adminControls.LogLevels;

public class IP {
	
	protected static String IPName = "ERROR";
	synchronized public static String obtainIP(){
		do{
			ConsoleControl.write("Generating IP...",LogLevels.Info);
			Random r = new Random();
			/*int oct1 = r.nextInt(256);
			int oct2 = r.nextInt(256);
			int oct3 = r.nextInt(256);
			int oct4 = r.nextInt(256);*/
			
			
			//Confirmations here
			
			IPName = r.nextInt(256) + "." + r.nextInt(256) + "." + r.nextInt(256) + "."
					+ r.nextInt(256);
			//System.out.println(IPName);
		}while(IPName == "255.255.255.255" | IPName == "0.0.0.0" | 
				IPName == "127.0.0.1" | IPName.contains("10.0.0.") |
				IPName.contains("192.168.1."));
		
		IPList.registerIP(IPName);
		
		return IPName;
	}
}
