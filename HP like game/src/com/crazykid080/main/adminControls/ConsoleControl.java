package com.crazykid080.main.adminControls;

import java.util.ArrayList;

public class ConsoleControl{
	protected static ArrayList<Object> consoles = new ArrayList<>();
	
	public static void registerConsole(Object hash){
		consoles.add(hash);
	}
	
	public static ArrayList<Object> getConsoles(){
		return consoles;
	}
	public static void write(String text){
		System.out.println(text);
		for (Object object : consoles) {
			((AdminConsole)object).write(text + "\n");
		}
	}
	public static void write(String text, LogLevels level){
		System.out.println(text);
		for (Object object : consoles) {
			((AdminConsole)object).write(text + "\n", level);
		}
	}
}
