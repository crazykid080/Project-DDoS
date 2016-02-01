package com.crazykid080.main;

import java.util.ArrayList;

import com.crazykid080.main.adminControls.ConsoleControl;
import com.crazykid080.main.controllers.IPController;

public class Server {
	protected ArrayList<Object> Drivers = new ArrayList<>();
	protected ArrayList<Object> Processes = new ArrayList<>();
	protected ArrayList<Object> Files = new ArrayList<>();
	protected String I POSTA ME = "ERROR!!!!!";
 	protected String IPAddress = "ERROR!!!!!!";
	protected String ServerType = "ERROR!!!!!";
	public Server(int i){
		//TODO: Implement this fully, as of right now, this doesnt not change anything!
		switch(i){
		case 1:
			ServerType = "Private";
			break;
		case 2:
			ServerType = "Public";
			break;
		case 3:
			ServerType = "Secret";
			break;
		case 4:
			ServerType = "Bank";
			break;
		default:
			ConsoleControl.write("ERROR: something went wrong with setting the type!");
			ConsoleControl.write("The assigned number to Type is: " + i);
		}
		IPAddress = IPController.obtainIP(this);
	}
	
	
	
	
	//Getters and setters after this line!
	public String getIPAddress() {
		return IPAddress;
	}
}
