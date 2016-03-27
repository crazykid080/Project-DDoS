package com.crazykid080.main.controllers;

import java.util.ArrayList;
import java.util.Random;

import com.crazykid080.main.adminControls.ConsoleControl;
import com.crazykid080.main.adminControls.LogLevels;
import com.crazykid080.main.userControl.Core;
import com.crazykid080.main.userControl.Server;

public class IPController {
	public static ArrayList<Object> IPs = new ArrayList<>();
	protected static String IPName = "";
	public static String obtainIP(Object hash){
		boolean added = false;
		do{
			Random r = new Random();
			IPName = r.nextInt(256) + "." + r.nextInt(256) + "." + r.nextInt(256) + "."
					+ r.nextInt(256);
			//System.out.println(IPName);
		}while(IPName == "255.255.255.255" | IPName == "0.0.0.0" | 
				IPName == "127.0.0.1");
		for (Object object : IPs) {

			if(object.equals(hash)){
				added = true;
				//System.out.println("Server has already been registered, probably an IP "
				//	+ "change.");
			}
		}
		if(added == false){
			IPs.add(hash);
		}
		return IPName;
	}

	public void unregisterIPAddress(Object c){
		IPs.remove(c);
	}

	public static boolean checkIP(String ip){
		for (Object object : IPs) {
			if(object.getClass().toString().equalsIgnoreCase("Server")){
				String usedIP = ((Server)object).getIPAddress();
				if(ip == usedIP){
					return false;
				}
			}else if(object.getClass().toString().equalsIgnoreCase("Core")){
				String usedIP = ((Server)object).getIPAddress();
				if(ip == usedIP){
					return false;
				}
			}
		}
		return true;
	}
	@SuppressWarnings("rawtypes")
	public static ArrayList<String> getIPAddresses(){
		ArrayList<String> e = new ArrayList<>();
		ConsoleControl.write("getIPAddresses fired.", LogLevels.Info);
		for (Object object : IPs) {
			Class a = object.getClass();
			String b = a.toString();
			if(b.equalsIgnoreCase("server")){
				ConsoleControl.write("Server is true.", LogLevels.Info);
				e.add(((Server)object).getIPAddress());
			}else if(b.equalsIgnoreCase("core")){
				e.add(((Core)object).getIPAddress());
			}
		}
		if(e.isEmpty()){
			ConsoleControl.write("There are no IP addresses.");
		}
		return e;
	}

	public static ArrayList<Object> getServers(){
		return IPs;
	}

}
