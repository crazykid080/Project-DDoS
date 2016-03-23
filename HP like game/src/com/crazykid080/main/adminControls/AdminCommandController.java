package com.crazykid080.main.adminControls;

import java.util.ArrayList;

import com.crazykid080.main.Main;
import com.crazykid080.main.controllers.IPController;
import com.crazykid080.main.processes.ProcessTypes;
import com.crazykid080.main.userControl.Core;
import com.crazykid080.main.userControl.Server;

public class AdminCommandController{

	protected static String commandList = "edit [faction] treasury {add,set,remove}"
			+ " [amount]"
			+ "\nedit stock {price, interest} {add,set,subtract}"
			+ "\nedit server new [server type] (IP address)"
			+ "\nedit server [IP address] program {add,remove} [process type] [process "
			+ "version]"
			+ "\nserver get {files,processes,drivers} [IP address]"
			+ "\nserver get ip all"
			+ "\nuser {ban,new} [username]";
	protected static String editCommands = "edit [faction] treasury {add,set,remove}"
			+ "[amount]"
			+ "\nedit stock {price, interest} {add,set,subtract}"
			+ "\nedit server new [server type] (IP address)"
			+ "\nedit server [IP address] program {add,remove} [process type] "
			+ "[process version]";
	protected static String serverCommands = "server get {files,processes,drivers} [IP address]"
			+ "\nserver get ip all";

	public static void runCommand(String command){		

		if(command.contains("edit")){

			if(command.contains("treasury")){

				if(command.contains("add") && command.contains("treasury add")){
					Main.notAdded();
					return;
				}else if(command.contains("remove") && command.contains("treasury"
						+ " remove")){
					Main.notAdded();
					return;
				}else if(command.contains("set") && command.contains("treasury set")){
					Main.notAdded();
					return;
				}

			}else if(command.contains("server") && command.contains("edit server")){
				if(command.contains("new") && command.contains("edit server new")){

					//THIS NEEDS TO BE HERE!!!!
					try{
						String s = command.substring(16, 17);
						//ConsoleControl.write(s);
						byte b = -1;
						if(s.contains("1")){
							b = 1;
						}else if(s.contains("2")){
							b = 2;
						}else if(s.contains("3")){
							b = 3;
						}else if(s.contains("4")){
							b = 4;
						}else{
							ConsoleControl.write("Server type: " + s + " does not"
									+ " exist!" , LogLevels.Error);
							return;
						}
						serverNew(b);
						return;
					}catch(Exception e){
						ConsoleControl.write("" + e, LogLevels.Error);
						return;
					}
					//---------------------
				}else if(command.contains ("change all ips") && command.contains("edit server change all ips")){
					editServerForceIPChange();
					return;
				}
			}
			ConsoleControl.write("You typed edit, but did not add anything else. \n"
					+ "Did you mean any of these:\n" + editCommands);
			return;
		}else if(command.contains("user")){
			if(command.contains("ban") && command.contains("user ban")){
				Main.notAdded();
				return;
			}else if(command.contains("add") && command.contains("user add")){
				Main.notAdded();
				return;
			}
		}else if(command.contains("server")){
			if(command.contains("get") && command.contains("server get")){
				if(command.contains("ip all")){
					serverGetIPAll();
					return;
				}
			}
			ConsoleControl.write("You typed server, but did not add anything else. \n"
					+ "did you mean any of these:\n" + serverCommands);
			return;
		}else if(command.contains("help")){
			ConsoleControl.write(commandList);
			return;
		}else if(command.contains("exit")){
			exit();
		}
		ConsoleControl.write("ERROR: command doesn't seem to be valid!");
	}

	public static void editTreasuryAdd(byte faction, double amount) {

	}


	public static void editTreasureRemove(byte faction, double amount) {
		// 

	}


	public static void editTreasurySet(byte faction, double amount) {
		// 

	}

	public static void editServerForceIPChange(){
		ArrayList<Object> servers = IPController.getServers();
		for (Object obj : servers) {


			if(obj.getClass().toString().equalsIgnoreCase("Server")){

				((Server)obj).forceIPChange();	

			}else if(obj.getClass().toString().equalsIgnoreCase("Core")){

				((Core)obj).forceIPChange();
			}
		}
	}


	public static void editStockPriceAdd(byte faction, double amount) {
		// 

	}


	public static void editStockPriceSubtract(byte faction, double amount) {
		// 

	}


	public static void editStockPriceSet(byte faction, double amount) {
		// 

	}


	public static void editStockInterestAdd(byte faction, double amount) {
		// 

	}


	public static void editStockInterestSubtract(byte faction, double amount) {
		// 

	}


	public static void editStockInterestSet(byte faction, double amount) {
		// 

	}
	@SuppressWarnings("unused")
	public static void serverNew(byte servType) {
		Server s = new Server(servType);
	}

	public static void serverNew(byte servType, String IP) {
		// 

	}


	public static void serverProgramAdd(String IP, ProcessTypes type, double vers) {
		// 

	}


	public static void serverProgramRemove(String IP, ProcessTypes type, double vers) {
		// 

	}


	public static void userBan(String name) {
		// 

	}


	public static void userNew(String name) {
		// 

	}


	public static void serverGetIPAll() {
		ArrayList<String> IPs = IPController.getIPAddresses();
		for (String string : IPs) {
			ConsoleControl.write(string , LogLevels.Info);
		}
	}


	public static void serverGetFiles(String IP) {
		// 

	}


	public static void serverGetProcesses(String IP) {
		// 

	}


	public static void serverGetDrivers(String IP) {
		// 

	}
	public static void exit() {
		System.exit(1);
	}

}
