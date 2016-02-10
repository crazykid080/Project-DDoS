package com.crazykid080.main
//TODO: Add new package for actions/functions

public class ProcessActions{


//I have no idea if this will work, I hope it does
public void onProcessKill(ProcessConstructor obj, boolean log){

obj.setRunning(false);

if(log == true){
Server s = obj.getServer();
//log.write(originip + " killed process " + process);
}

}  //method end PLEASE REMOVE THIS AFTER YOU REFORMAT THIS

public void onProcessStart(ProcessConstructor obj, boolean log){

}//method end REMOVE COMMENT

public void onInstallStart(/*NEED TO CREATE THE FILES*/ int mil){
//new timer(time, file);
//
}  //method end DELETE THIS COMMENT

}
