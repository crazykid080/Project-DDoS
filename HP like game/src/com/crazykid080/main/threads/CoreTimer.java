package com.crazykid080.main.threads;

import java.util.ArrayList;

import com.crazykid080.main.adminControls.ConsoleControl;
import com.crazykid080.main.userControl.Core;

public class CoreTimer implements Runnable{

	private long timeLeft = 0;
	private long timeMax = 0;

	ArrayList<Core> CoreList = new ArrayList<Core>();

public CoreTimer(int seconds, Object o){
		//obj = new ArrayList<Object>();
		long time = seconds * 1000;
		this.timeMax = time;
		//obj.add(o);
	}

	public CoreTimer(int seconds , int minutes, Object o){
		//obj = new ArrayList<Object>();
		ConsoleControl.write(minutes);
		ConsoleControl.write(seconds);
		seconds += minutes * 60;
		long time = seconds * 1000;
		this.timeMax = time;
		//obj.add(o);
	}

	public CoreTimer(int seconds , int minutes, int hours, Object o){
		//obj = new ArrayList<Object>();
		ConsoleControl.write(hours);
		ConsoleControl.write(minutes);
		ConsoleControl.write(seconds);
		minutes += hours * 60;
		seconds += minutes * 60;
		long time = seconds * 1000;
		this.timeMax = time;
		//obj.add(o);
	}

public void addCore(Core obj){

CoreList.add(obj);

}

@Override
	public synchronized void run(){
this.wait(timeLeft);

 for (Core object : CoreList) {
object.onProcessComplete();
}

}

}
