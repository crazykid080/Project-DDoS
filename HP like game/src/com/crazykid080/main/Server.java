package com.crazykid080.main;

import java.util.ArrayList;

import com.crazykid080.main.adminControls.ConsoleControl;
import com.crazykid080.main.adminControls.LogLevels;
import com.crazykid080.main.constructors.ProcessConstructor;
import com.crazykid080.main.controllers.IPController;

public class Server {
	protected ArrayList<Object> Drivers = new ArrayList<>();
	protected ArrayList<Object> Processes = new ArrayList<>();
	protected ArrayList<Object> Files = new ArrayList<>();
	protected String IPListName = "ERROR!!!!!";
	protected String IPAddress = "ERROR!!!!!!";
	protected String ServerType = "ERROR!!!!!";
	//private double burnout = 0;
	^private int burnoutCap = 100;
/**
* This will hold the Username of the owner, default is Admin.
*/
private String Owner = "Admin";
	/**
	 * @author crazykid080
	 * @param i The server type.
	 */
	public Server(int i){
		//TODO: Implement this fully, as of right now, this doesn't not change anything!
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
			ConsoleControl.write("ERROR: something went wrong with setting the type!" , LogLevels.Error);
			ConsoleControl.write("The assigned number to Type is: " + i, LogLevels.Info);
		}
		IPListName = ServerType + "Server ";
		IPAddress = IPController.obtainIP(this);
	}

	/**
	 * @author crazykid080
	 * @param i The server type, this should never be 1! 
	 * @param f The faction that the server belongs to (What factions there will be is to be determined).
	 */
	public Server(int i, int f){
		//TODO: Implement this fully, as of right now, this doesn't not change anything!
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
			ConsoleControl.write("ERROR: something went wrong with setting the type!" , LogLevels.Error);
			ConsoleControl.write("The assigned number to Type is: " + i, LogLevels.Info);
		}
		switch(f){
		case 1:
			//faction 1
			//String IPListName = ServerType + " " + faction + " Server";
			break;
		case 2:
			//faction 2
			//String IPListName = ServerType + " " + faction + " Server";
			break;
		case 3:
			//faction 3
			//String IPListName = ServerType + " " + faction + " Server";
			break;
		case 4:
			//faction 4
			//String IPListName = ServerType + " " + faction + " Server";
			break;
		default:
			ConsoleControl.write("ERROR: something went wrong with setting the faction!" , LogLevels.Error);
			ConsoleControl.write("The assigned number to the faction is: " + i, LogLevels.Info);
		}
		IPListName = ServerType + "Server ";
		IPAddress = IPController.obtainIP(this);
	}

	public void calculateBurnout(){
		//burnout += .03;
		/*if(burnoutCap <= burnout){
			startServerCrash();
		*/}
	}

	public void calculateBurnoutNT(){

	}
	public void startServerCrash(){
		for (Object object : Processes) {
			((ProcessConstructor)object).calculateBurnout();
		}
	}

private void createDrivers(){
protected DriverConstructor 1 = new DriverConstructor(DriverTypes.IDE, .05);
Drivers.add(1);
protected DriverConstructor 2 = new DriverConstructor(DriverTypes.SysBurn);
Drivers.add(2);
protected DriverConstructor 3 = new DriverConstructor(DriverTypes.CPUOptimize);
Drivers.add(3);
protected DriverConstructor 4 = new DriverConstructor(DriverTypes.RAMOptimize);
Drivers.add(4);
protected DriverConstructor 5 = new DriverConstructor(DriverTypes.Recovery, 0);
Drivers.add(5);
protected DriverConstructor 6 = new DriverConstructor(DriverTypes.AVSystem, 0);
Drivers.add(6);
}

	//Getters and setters after this line!
	public String getIPAddress() {
		return IPAddress;
	}

	public ArrayList<Object> getDrivers() {
		return Drivers;
	}

	public ArrayList<Object> getProcesses() {
		return Processes;
	}

	public ArrayList<Object> getFiles() {
		return Files;
	}

}
