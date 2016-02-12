package com.crazykid080.main.userControl;

import java.util.ArrayList;

public class User {
	private ArrayList<Object> ownedServers = new ArrayList<Object>();
	private Object activeServer = null;
	protected String user = "ERROR!!!!!!!!";
	
	public User(String username){
		ownedServers = new ArrayList<Object>();
if(ownedServers.isEmpty()){
		Server a = new Server(username);
		ownedServers.add(a);
		activeServer = a;
}else{
ConsoleControl.write("User already has a server, HOW DOES IT HAVE SOMETHING!", LogLevels.Error);
ConsoleControl.write("This may not be an error later in development.", LogLevels.info);
}
		this.user = username;
		
	}
	
	public Object getActiveServer(){
		return activeServer;
	}
	
	public void addServer(Object s){
		ownedServers.add(s);
	}
	//TODO: create the function that works!
	public boolean validateUser(){
		return false;
	}
	
	public String getUsername(){
		return user;
	}
	public void removeUser(){
		for (Object object : ownedServers) {
			((Server)object).deleteServer();
		}
		for (int i = 0; i < ownedServers.size(); i++) {
			ownedServers.remove(i);
		}
		user = "";
		activeServer = null;
	}
}
