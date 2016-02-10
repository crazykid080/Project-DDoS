package com.crazykid080.main
//TODO: Add new package for actions/functions

public class ProcessActions{


//I have no idea if this will work, I hope it does
public void onProcessKill(ProcessConstructor obj, boolean log){

obj.setRunning(false);

if(log == true){
//log.write(originip + " killed process " + process);
}

}

}
