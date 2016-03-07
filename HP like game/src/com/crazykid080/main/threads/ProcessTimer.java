package com.crazykid080.main.threads;

public class ProcessTimer implements Runnable{

	private long timeLeft = 0;

	public ProcessTimer(int seconds){
		long time = seconds * 1000;
		this.timeLeft = time;
	}

	public ProcessTimer(int seconds , int minutes){
		seconds += minutes * 60;
		long time = seconds * 1000;
		this.timeLeft = time;
	}

	@Override
	public synchronized void run(){
		while (true){
			try {
				this.wait(timeLeft);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			//complete process here?
		}

	}

}
