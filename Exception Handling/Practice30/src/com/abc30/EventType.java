package com.abc30;

public class EventType {
	private  Long id	;
	private String name	;
	public EventType()
	{
		
	}
	public EventType(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}


	
}
