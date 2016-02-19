package com.crazykid080.main.controllers;

public class FIDController{

protected ArrayList<Object> files = new ArrayList<Object>();

public int registerFile(Object hash){

if(files.contains(hash){
return files.indexOf(hash);
}

files.add(hash);
return files.indexOf(hash);

}

public void unregisterFile(Object hash){

//this is probably the wrong method
files.replace(hash, null);

}


}
