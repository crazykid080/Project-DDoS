package com.crazykid080.main.adminControls;

import com.crazykid080.main.processes.ProcessTypes;

public interface AdminCommands{
	public void editTreasuryAdd(byte faction, double amount); 
	//Command: edit [faction] treasury add [amount]
	
	public void editTreasureRemove(byte faction, double amount);
	//Command: edit [faction] treasury remove [amount]
	
	public void editTreasurySet(byte faction, double amount);
	//Command: edit [faction] treasury set [amount]
	
	public void editStockPriceAdd(byte faction, double amount);
	//Command: edit [faction] stock price add [amount]
	
	public void editStockPriceSubtract(byte faction, double amount);
	//Command: edit [faction] stock price subtract [amount]
	
	public void editStockPriceSet(byte faction, double amount);
	//Command: edit [faction] stock price set [amount]
	
	public void editStockInterestAdd(byte faction, double amount);
	//Command: edit [faction] stock interest add [amount]
	
	public void editStockInterestSubtract(byte faction, double amount);
	//Command: edit [faction] stock interest subtract [amount]
	
	public void editStockInterestSet(byte faction, double amount);
	//Command: edit [faction] stock interest set [amount]
	
	public static void serverNew(byte servType) {}
	public static void serverNew(byte servType, String IP){}
	//Command: edit server new [servType] [IP]
	
	public void serverGetIPAll();
	//Command: server get IP all
	
	public void serverGetFiles(String IP);
	//Command: server get files [IP]
	
	public void serverGetProcesses(String IP);
	//Command: server get processes [IP]
	
	public void serverGetDrivers(String IP);
	//Command: server get drivers [IP]
	
	public void serverProgramAdd(String IP, ProcessTypes type, double vers);
	//Command: edit server [IP] program add [type] [version]
	
	public void serverProgramRemove(String IP, ProcessTypes type, double vers);
	//Command: edit server [IP] program remove [type] [version]
	
	public void userBan(String name);
	//Command: user ban [name]
	
	public void userNew(String name);
	//Command: user new [name]
	
	public static void exit(){
		System.exit(1);
	}
}
