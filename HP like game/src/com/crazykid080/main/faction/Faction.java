package com.crazykid080.main.faction;

import java.util.ArrayList;

import com.crazykid080.main.userControl.User;

public class Faction {
	
	long treasury = 1000;
	ArrayList<User> members = new ArrayList<>();
	double stockValue = 2.5;
	double interestPercent = .15;
	
	public void addFunds(long fund){
		treasury += fund;
	}
	
	public void calculateStock(){
		
	}
	
}
