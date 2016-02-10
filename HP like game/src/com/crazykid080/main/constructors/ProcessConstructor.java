package com.crazykid080.main.constructors;

import com.crazykid080.main.adminControls.ConsoleControl;
import com.crazykid080.main.controllers.Callbacks;
import com.crazykid080.main.processes.ProcessAttributes;
import com.crazykid080.main.processes.ProcessTypes;

//TODO: rename to FileConstructor
public class ProcessConstructor implements ProcessAttributes{
	private boolean hasSubprocess = false;
	private boolean isSubprocess = false;
	private boolean hasTimedSubproces = false;
	private boolean isRemoteSubprocess = false;
	private boolean isInstalling = false;
	private boolean hasRemoteLog = false;
	private boolean isProtectable = true;
	public double version = -1;
	public double burnout = -1;
	public double burnoutCap = -1;
	protected double encryption = -1;
	protected double hidden = -1;
	/**This is the percentage (represented in decimals (100% = 1)) of burnout taken.
	 * @author crazykid080
	 */
	private double burnoutForm = 100000;
	protected String LocalName = "ERROR";
	public String VisibleName = "ERROR";
	private String VisNameType = "ERROR";
	private ProcessTypes type = null;
	private boolean isRunning = false;
	public ProcessConstructor(double Vers, double Burnout, ProcessTypes type){
		this.type = type;
		this.burnout = Burnout;
		this.version = Vers;
		this.encryption = 0;
		this.hidden = 0;
		burnoutForm = 1;
		burnoutCap = 1000 * burnout;
		switch(type){
		case Firewall_Protect:
			VisNameType = "Firewall Protect";
			burnoutForm = 1;
			break;
		case Password_Protect:
			VisNameType = "Password Protect";
			break;
		case Firewall_Break:
			VisNameType = "Firewall Break";
			break;
		case Password_Break:
			VisNameType = "Password Break";
			hasTimedSubproces = true;
			isRemoteSubprocess = true;
			break;
		case Log_Deleter:
			VisNameType = "Log Deleter";
			break;
		case Download:
			break;
		case IP_Cloak:
			break;
		case Log_Undeleter:
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
		case Burnout_Capacitor:
			burnoutCap = 2500 * version;
			break;
		case Timer:
			burnoutForm = 0;
			burnoutCap = 0;
			break;
		default:
			ConsoleControl.write("ERROR: Process type not found! Why was this"
					+ " not caught before?");
			System.exit(0);
			break;
		}
		LocalName = type+" Ver "+version+" - "+burnout;
		VisibleName = VisNameType+" Version "+version+" ("+burnout+")";
		//ConsoleControl.write("Set LocalName is: "+LocalName+" .");
		//ConsoleControl.write("Set VisibleName is: "+VisibleName+" .");
		Callbacks.RegisterProcess(this);

	}
	public void setBurnout(double percent){
		ConsoleControl.write("Old burnout: "+this.burnout);
		this.burnout = percent;
		ConsoleControl.write("New burnout: "+this.burnout);
	}
	public void addBurnout(double percent){
		ConsoleControl.write("Old burnout: "+this.burnout);
		this.burnout += percent;
		ConsoleControl.write("New burnout: "+this.burnout);
	}
	public void onBurnoutTick(){
		addBurnout(burnoutForm * .01);
	}
	public void calculateBurnout(){
		if(type != ProcessTypes.Timer ){
			if(burnoutCap <= burnout){
				initiateProccessCrash();
			}
		}
	}
	public void initiateProccessCrash(){
		
	}

	//--------------- getters below

	public ProcessTypes getType(){
		return type;
	}
	public double getVersion(){
		return version;
	}
	public boolean isRunning() {
		return isRunning;
	}
	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}

	// ------------------ attributes below

	@Override
	public boolean hasSubprocess() {
		return hasSubprocess;

	}
	@Override
	public boolean isSubprocess() {
		return isSubprocess;

	}
	@Override
	public boolean hasTimedSubprocess() {
		return hasTimedSubproces;

	}
	@Override
	public boolean isInstalling() {
		return isInstalling;
	}
	@Override
	public boolean hasRemoteLog(String log) {
		return hasRemoteLog;

	}
	@Override
	public boolean hasLocalLog(String log) {
		return false;
		//TODO: FIX THE RETURN BECAUSE IT ALWAYS RETURNS FALSE

	}
	@Override
	public boolean isResearch() {
		isProtectable = false;
		return false;
		//TODO: FIX THE RETURN BECAUSE IT ALWAYS RETURNS FALSE
	}
	@Override
	public boolean isTimedMainProcess() {
		return false;
		//TODO: FIX THE RETURN BECAUSE IT ALWAYS RETURNS FALSE
	}
	@Override
	public boolean isRemoteSubprocess() {
		return isRemoteSubprocess;
	}
	@Override
	public boolean isProtected() {
		//TODO: FIX THE RETURN BECAUSE IT ALWAYS RETURNS FALSE
		return false;
	}
	@Override
	public boolean isProtectable() {
		return isProtectable;
	}
	@Override
	public void setProtection(double hidden, double encryption, boolean is) {
		if(isProtectable()){

		}
	}





}
