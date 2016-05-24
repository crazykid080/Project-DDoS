package com.crazykid080.main.threads;

import java.util.ArrayList;

import com.crazykid080.main.userControl.Core;

import crazykid080.main.adminControls.ConsoleControl;

public class ProcessTimer implements Runnable{

	private long timeLeft = 0;
	private long timeMax = 0;

	ArrayList<Object> obj = new ArrayList<Object>();

	public ProcessTimer(int seconds, Object o){
		obj = new ArrayList<Object>();
		long time = seconds * 1000;
		this.timeMax = time;
		obj.add(o);
	}

	public ProcessTimer(int seconds , int minutes, Object o){
		obj = new ArrayList<Object>();
		ConsoleControl.write(minutes);
		ConsoleControl.write(seconds);
		seconds += minutes * 60;
		long time = seconds * 1000;
		this.timeMax = time;
		obj.add(o);
	}

	public ProcessTimer(int seconds , int minutes, int hours, Object o){
		obj = new ArrayList<Object>();
		ConsoleControl.write(hours);
		ConsoleControl.write(minutes);
		ConsoleControl.write(seconds);
		minutes += hours * 60;
		seconds += minutes * 60;
		long time = seconds * 1000;
		this.timeMax = time;
		obj.add(o);
	}

	@Override
	public synchronized void run(){
		timeLeft = timeMax;
		while (true){
			try {
				this.wait(timeLeft);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			for (Object object : obj) {
				switch(object.getClass().toString()){
				case "class com.crazykid080.main.userControl.Core":
					((Core)object).onProcessComplete();
				
				case "class com.crazykid080.main.userControl.Server":
					
				}
			}
		}

	}

}
