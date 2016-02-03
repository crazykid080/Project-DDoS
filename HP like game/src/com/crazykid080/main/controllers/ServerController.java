package com.crazykid080.main.controllers;

import java.util.ArrayList;

import com.crazykid080.main.Server;

public class ServerController {
	protected static ArrayList<Object> serverList = new ArrayList<Object>();

	public void registerServer(Object hash){
		serverList.add(hash);
	}
	public void unregisterServer(Object hash){
		serverList.remove(hash);
	}

	public static ArrayList<Object> getAllServers(){
		return serverList;
	}
	
	public Object getServer(String IP){
		for(Object object : serverList){
			String servIP = ((Server)object).getIPAddress();
			if(IP.contains(servIP)){
				return object;
			}
		}
		return null;
	}
}
