package com.crazykid080.main.processes;

public interface ProcessAttributes {
	public boolean hasSubprocess();
	public boolean isSubprocess();
	public boolean hasTimedSubprocess();
	public boolean isRemoteSubprocess();
	public boolean isInstalling();
	public boolean hasRemoteLog(String log);
	public boolean hasLocalLog(String log);
	public boolean isProtected();
	public void setProtection(double hidden, double encryption, boolean is);
	public boolean isProtectable();
	public boolean isResearch();
	public boolean isTimedMainProcess();
}
