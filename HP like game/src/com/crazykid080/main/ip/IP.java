package com.crazykid080.main.ip;

import java.util.Random;

public class IP {
	
	protected static String IPName = "";
	synchronized public static String obtainIP(Object hash){
		do{
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
				IPName == "127.0.0.1");
		
		return IPName;
	}
}
