package com.crazykid080.main;

//TODO: move this to a new package
public class FileConstructor{

//TODO: add file ID controller
//TODO: add file type enum
String publicName = "ERROR!!!";
private Server parent = null;
protected double burnout = -1;
public double version = -1;

public FileConstructor(ProcessTypes type, double vers, Server parent){

this.burnout = 0;
this.version = vers;
this.parent = parent;

publicName = type + " (" + burnout + " ) " + version;

}

public void doResearch(int hours){

if(version >= 10){

double addition = hours * .01;

}else{

double addition = hours * .001 / 2;

}

ConsoleControl.write("research will add; " + addition, LogLevels.Info);

}//method end

}
