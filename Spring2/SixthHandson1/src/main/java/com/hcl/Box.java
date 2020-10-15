package com.hcl;

public class Box {
	int length;
	int width;
	User user;

	public Box() {

	}

	public Box(int length, int width, User user) {
		super();
		this.length = length;
		this.width = width;
		this.user = user;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
