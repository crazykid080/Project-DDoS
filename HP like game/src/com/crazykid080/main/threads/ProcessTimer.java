package com.crazykid080.main.threads;

public class ProcessTimer{

private int timeLeft = 0;

public ProcessTimer(int time){
this.timeLeft = time;

}

@override
public synchronized void run(){
while (true){

try {
this.wait(timeLeft

}catch(InterruptedException e){
e.printStackTrace();

}

}

}//METHOD END

}
