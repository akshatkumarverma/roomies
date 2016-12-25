package com.aks.beans;

public class UserDetails {
	
	String uname;
	String password;
	
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "UserDetails [uname=" + uname + ", password=" + password + "]";
	}

}
