package com.crazykid080.main.server;

import java.util.ArrayList;

public class ServerList {
	private static ArrayList<Server> List = new ArrayList<Server>();
	public static void registerServer(Server hash) {
		List.add(hash);
	}
	
	public static Server findServerbyIP(String IP){
		for (Server server : List) {
			if(server.getIP() == IP) {
				return server;
			}
		}
		return null;
	}
	
	public static Server findServerbyName(String name) { //FOR THE FUTURE
		//NOTE: IF i implement multiple servers this will be an issue
		return null;
	}
}