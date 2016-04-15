package com.crazykid080.main.threads;

import java.util.ArrayList;

import com.crazykid080.main.userControl.Core;

public class CoreTimer implements Runnable{

	private long timeLeft = 0;
	@SuppressWarnings("unused")
	private long timeMax = 0;

	ArrayList<Object> CoreList = new ArrayList<Object>();

	public CoreTimer(int seconds){
		//obj = new ArrayList<Object>();
		long time = seconds * 1000;
		this.timeMax = time;
		//obj.add(o);
	}

	public CoreTimer(int seconds , int minutes){
		//obj = new ArrayList<Object>();
		seconds += minutes * 60;
		long time = seconds * 1000;
		this.timeMax = time;
		//obj.add(o);
	}

	public CoreTimer(int seconds , int minutes, int hours){
		//obj = new ArrayList<Object>();
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
		timeLeft = timeMax;
		try {
			this.wait(timeLeft);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

		for (Object object : CoreList) {
			((Core)object).onProcessComplete();
		}

	}

}
