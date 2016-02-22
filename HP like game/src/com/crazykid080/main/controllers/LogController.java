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
//TODO: Find a way to get the class here!
}

public boolean registerLogListener(Object obj){

if(listeners.contains(obj)){
return true;
}

listeners.add(obj);
if(listeners.contains(Object obj){
return true;
}else{
ConsoleControl.write("Class: LogController, Object " + obj + "could not be added to the listeners ArrayList!", LogLevels.Error);
return false;
}
return false;
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
