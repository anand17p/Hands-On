package com.abc60;


public class User implements Comparable<User>{
	String name;
	long mobilenumber;
	String username;
	String password;

	public User() {

	}

	public User(String name, long mobilenumber, String username, String password) {
		super();
		this.name = name;
		this.mobilenumber = mobilenumber;
		this.username = username;
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public long getMobilenumber() {
		return mobilenumber;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}


	@Override
	public int compareTo(User h) {
		if(this.mobilenumber==h.mobilenumber)
			return 0;
			else if(this.mobilenumber>h.mobilenumber)
			return -1;
			else
				return 1;
		
	}

	public String toString() {
		return name +mobilenumber+ username + password;
	}

}
