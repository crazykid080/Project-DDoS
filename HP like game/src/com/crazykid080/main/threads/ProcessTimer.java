package com.crazykid080.main.threads;

public class ProcessTimer implements Runnable{

	private int timeLeft = 0;

	public ProcessTimer(int time){
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
