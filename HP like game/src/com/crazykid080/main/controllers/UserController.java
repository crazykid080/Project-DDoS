package com.crazykid080.main.controllers;

import java.util.ArrayList;
import com.crazykid080.main.userControl.*;

public class UserController {
	protected ArrayList<Object> users = new ArrayList<Object>();

	public void registerUser(Object s){
		for (Object object : users) {
			if(object.equals(s)){
				return;
			}
		}
		users.add(s);
	}
	public boolean validateUser(String us){
		for (Object object : users) {
			String user = ((User)object).getUsername();
			if(user.equals(us)){
				return true;
			}
		}
		return false;
	}
	public void deleteUser(String user){

	}
	public void deleteUser(Object s){
		((User)s).removeUser();
	}
}
