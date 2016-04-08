package com.crazykid080.main.userControl;

import java.util.ArrayList;
import java.util.Random;

import com.crazykid080.main.adminControls.ConsoleControl;
import com.crazykid080.main.adminControls.LogLevels;
import com.crazykid080.main.constructors.FileConstructor;
import com.crazykid080.main.controllers.IPController;
import com.crazykid080.main.drivers.DriverTypes;
import com.crazykid080.main.constructors.DriverConstructor;

public class Server {
	protected ArrayList<Object> Drivers = new ArrayList<>();
	protected ArrayList<Object> Processes = new ArrayList<>();
	protected ArrayList<Object> Files = new ArrayList<>();
	protected ArrayList<String> LogFile = new ArrayList<>();
	protected String IPListName = "ERROR!!!!!";
	protected String IPAddress = "ERROR!!!!!!";
	protected String ServerType = "ERROR!!!!!";
	//private double burnout = 0;
	//private int burnoutCap = 100;
	/**
	 * This will hold the Username of the owner, default is Admin.
	 */
	@SuppressWarnings("unused")
	private String Owner = "Admin";
	/**
	 * @author crazykid080
	 * @param i The server type.
	 */
	public Server(){
		
	}
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
			ConsoleControl.write("Attempted to create a private faction server!", LogLevels.Error);
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

	public Server(String Owner){
		//TODO: This does not validate the owner.
		//Reason: No User class yet!
		this.Owner = Owner;
	}

	public void calculateBurnout(){
		//TODO: Make this do SOMETHING!
		//burnout += .03;
		/*if(burnoutCap <= burnout){
			startServerCrash();
		 }*/
	}

	public void calculateBurnoutNT(){
		/*if(burnoutCap <= burnout){
			startServerCrash();
		 }*/
	}
	public void startServerCrash(){
		Random r = new Random();
		double chance = r.nextInt(1000);
		for (Object object : Processes) {

			if(chance >= 350){
				((FileConstructor)object).addBurnout(35);
			}else if(chance >= 500){
				((FileConstructor)object).addBurnout(10);
			}

			((FileConstructor)object).calculateBurnout();
		}
	}

	public void forceIPChange(){
		IPAddress = IPController.obtainIP(this);
	}

	@SuppressWarnings("unused")
	private void createDrivers(){
		//TODO: Add this to constructors.
		DriverConstructor a = new DriverConstructor(DriverTypes.IDE, .05);
		Drivers.add(a);
		DriverConstructor b = new DriverConstructor(DriverTypes.SysBurn);
		Drivers.add(b);
		DriverConstructor c = new DriverConstructor(DriverTypes.CPUOptimize);
		Drivers.add(c);
		DriverConstructor d = new DriverConstructor(DriverTypes.RAMOptimize);
		Drivers.add(d);
		DriverConstructor e = new DriverConstructor(DriverTypes.Recovery, 0);
		Drivers.add(e);
		DriverConstructor f = new DriverConstructor(DriverTypes.AVSystem, 0);
		Drivers.add(f);
	}

	public void writeLog(String text){
		LogFile.add("DATE" + text);
	}

	public void deleteServer(){
		Drivers.clear();
		Processes.clear();
		Files.clear();
		LogFile.clear();
		IPListName = "";
		IPAddress = "";
		ServerType = null;
		Owner = "";
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
