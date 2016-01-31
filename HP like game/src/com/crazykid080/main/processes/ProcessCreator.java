package com.crazykid080.main.processes;

import com.crazykid080.main.adminControls.ConsoleControl;
import com.crazykid080.main.constructors.ProcessConstructor;
import com.crazykid080.main.controllers.Callbacks;

public class ProcessCreator {
	public static void CreateProcess(ProcessTypes process, double vers, double burnout){
		switch(process){
		case Download:
			break;
		case Firewall_Protect:
			break;
		case IP_Cloak:
			break;
		case Log_Deleter:
			break;
		case Log_Undeleter:
			break;
		case Password_Protect:
			break;
		case Process_Decryptor:
			break;
		case Process_Encryptor:
			break;
		case Process_Hider:
			break;
		case Process_Unhider:
			break;
		case Remote_AV:
			break;
		case Remote_Install:
			break;
		case SPLProcess_Decryptor:
			break;
		case SPLProcess_Encryptor:
			break;
		case SPLProcess_Hider:
			break;
		case SPLProcess_Unhider:
			break;
		case SPPassword_Break:
			break;
		case SPRProcess_Decryptor:
			break;
		case SPRProcess_Encryptor:
			break;
		case SPRProcess_Hider:
			break;
		case SPRProcess_Unhider:
			break;
		case SPRemote_Malware:
			break;
		case Scan_Block:
			break;
		case Upload:
			break;
		default:
			ConsoleControl.write("ERROR: process type + \" " + process + " \" is not valid"
					+ ", Java should of caught it but this is a special case! odd...");
			System.exit(0);
			break;
		}
		//ConsoleControl.write("Creating process.");
		ProcessConstructor con = new ProcessConstructor(vers, burnout, process);
		Callbacks.RegisterProcess(con);
	}
}
