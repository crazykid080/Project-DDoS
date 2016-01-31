package com.crazykid080.main.threads;



public class BurnoutTimer implements Runnable {
	public BurnoutTimer() {

	}

	@Override
	public synchronized void run() {
		while(true){
			try {
				//this.wait(900000);
				this.wait(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Tick");
			
		}
	}

}
