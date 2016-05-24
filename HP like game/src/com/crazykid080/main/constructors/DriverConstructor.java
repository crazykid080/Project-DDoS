package com.crazykid080.main.constructors;

import java.util.ArrayList;

import com.crazykid080.main.drivers.DriverTypes;

import crazykid080.main.adminControls.ConsoleControl;
import crazykid080.main.adminControls.LogLevels;

public class DriverConstructor{

	@SuppressWarnings("unused")
	private double version = 0;

	//THESE SHOULD NOT BE DEFINED FOR ALL DRIVERS
	@SuppressWarnings("unused")
	private double burnCap = -1;
	@SuppressWarnings("unused")
	private double crashAffect = 1;
	@SuppressWarnings("unused")
	private ArrayList<Object> files = new ArrayList<Object>();
	//----------------

	public DriverConstructor(DriverTypes type){

		switch(type){
		case AVSystem:
			break;
		case CPUOptimize:
			break;
		case IDE:
			break;
		case InstalledVirus:
			break;
		case RAMOptimize:
			break;
		case Recovery:
			crashAffect = .85;
			break;
		case SysBurn:
			crashAffect = 0;
			break;
		default:
			break;
		}


	}

	public DriverConstructor(DriverTypes type, double version){

		switch(type){
		case AVSystem:
			this.version = version;
			break;
		case CPUOptimize:
			this.version = version;
			break;
		case IDE:
			break;
		case InstalledVirus:
			this.version = version;
			break;
		case RAMOptimize:
			this.version = version;
			break;
		case Recovery:
			crashAffect = .85;
			this.version = version;
			break;
		case SysBurn:
			crashAffect = 0;
			this.version = version;
			break;
		default:
			ConsoleControl.write("Attempted to create a driven that is not defined!", LogLevels.Error);
			break;
		}

	}

}
