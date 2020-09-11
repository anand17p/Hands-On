package com.abc5;

public class ExtraType {
	private String name;
	private long runs;
	public ExtraType() {
		
	}
	public ExtraType(String name, long runs) {
		super();
		this.name = name;
		this.runs = runs;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRuns(long runs) {
		this.runs = runs;
	}
	public String getName() {
		return name;
	}
	public long getRuns() {
		return runs;
	}
	
}
