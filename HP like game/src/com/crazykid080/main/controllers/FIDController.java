package com.crazykid080.main.controllers;

import java.util.ArrayList;

import com.crazykid080.main.adminControls.ConsoleControl;
import com.crazykid080.main.adminControls.LogLevels;

public class FIDController{

	protected ArrayList<Object> files = new ArrayList<Object>();

	public int registerFile(Object hash){

		if(files.contains(hash)){
			return files.indexOf(hash);
		}

		files.add(hash);
		return files.indexOf(hash);

	}

	public void unregisterFile(Object hash){
		try{

			files.set(files.indexOf(hash), null);

		}catch(Exception e){

			ConsoleControl.write("ERROR(FIDController): " + e, LogLevels.Error);
			return;

		}

	}


}
