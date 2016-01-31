package com.crazykid080.main.adminControls;

import java.util.ArrayList;

import com.crazykid080.main.Main;
import com.crazykid080.main.Server;
import com.crazykid080.main.controllers.IPController;
import com.crazykid080.main.processes.ProcessTypes;

public abstract class AdminCommandController{

	protected static String commandList = "edit [faction] treasury {add,set,remove}"
			+ " [amount]"
			+ "\n edit stock {price, interest} {add,set,subtract}"
			+ "\n edit server new [server type] (IP address)"
			+ "\n edit server [IP address] program {add,remove} [process type] [process "
			+ "version]"
			+ "\n server get {files,processes,drivers} [IP address]"
			+ "\n server get ip all"
			+ "\n user {ban,new} [username]";

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
					try{
						String s = command.substring(16, 17);
						ConsoleControl.write(s);
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
							ConsoleControl.write("ERROR: Server type: " + s + " does not"
									+ " exist!");
							return;
						}
						serverNew(b);
						return;
					}catch(Exception e){
						ConsoleControl.write("ERROR: " + e, LogLevels.Error);
					}
				}
			}

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
					ArrayList<String> ips = IPController.getIPAddresses();
					for (String string : ips) {
						ConsoleControl.write(" " + string);
					}
					return;
				}
			}

		}else if(command.contains("help")){
			ConsoleControl.write(commandList);
			return;
		}else if(command.contains("exit")){
			exit();
		}
		ConsoleControl.write("ERROR: command doesnt seem to be vaild!");
	}

	public void editTreasuryAdd(byte faction, double amount) {
		// TODO Auto-generated method stub

	}


	public void editTreasureRemove(byte faction, double amount) {
		// TODO Auto-generated method stub

	}


	public void editTreasurySet(byte faction, double amount) {
		// TODO Auto-generated method stub

	}


	public void editStockPriceAdd(byte faction, double amount) {
		// TODO Auto-generated method stub

	}


	public void editStockPriceSubtract(byte faction, double amount) {
		// TODO Auto-generated method stub

	}


	public void editStockPriceSet(byte faction, double amount) {
		// TODO Auto-generated method stub

	}


	public void editStockInterestAdd(byte faction, double amount) {
		// TODO Auto-generated method stub

	}


	public void editStockInterestSubtract(byte faction, double amount) {
		// TODO Auto-generated method stub

	}


	public void editStockInterestSet(byte faction, double amount) {
		// TODO Auto-generated method stub

	}
	@SuppressWarnings("unused")
	public static void serverNew(byte servType) {
		Server s = new Server(servType);
	}

	public void serverNew(byte servType, String IP) {
		// TODO Auto-generated method stub

	}


	public void serverProgramAdd(String IP, ProcessTypes type, double vers) {
		// TODO Auto-generated method stub

	}


	public void serverProgramRemove(String IP, ProcessTypes type, double vers) {
		// TODO Auto-generated method stub

	}


	public void userBan(String name) {
		// TODO Auto-generated method stub

	}


	public void userNew(String name) {
		// TODO Auto-generated method stub

	}


	public void serverGetIPAll() {
		// TODO Auto-generated method stub

	}


	public void serverGetFiles(String IP) {
		// TODO Auto-generated method stub

	}


	public void serverGetProcesses(String IP) {
		// TODO Auto-generated method stub

	}


	public void serverGetDrivers(String IP) {
		// TODO Auto-generated method stub

	}
	public static void exit() {
		System.exit(1);
	}

}
