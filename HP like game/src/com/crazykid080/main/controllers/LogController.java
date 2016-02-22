package com.crazykid080.main.controllers;

public class LogController{

//TODO: should I overhaul this later?
//this may be very inefficient and deadly for computer speed!

protected String logFile = "ERROR!!";
protected Server owner = null;

protected ArrayList<Object> listeners = new ArrayList<Object>();

public LogController(Server owner){
listeners = new ArrayList<Object>();

logFile = "";

}

//actions

public void addLog(String text){

tmpLF = logFile;
logFile = tmpLF + "\n" + text;
notifyListeners();

}

protected void notifyListeners(){

if(listeners.isEmpty()){
return;
}

for(Object obj : listeners){
//find a way to get the class here!
}


}

//getters below

public String getLogFile(){
return logFile;
}

public LogController getObject(){
return this;
}

}
