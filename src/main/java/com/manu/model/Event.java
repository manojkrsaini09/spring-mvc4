package com.manu.model;

import org.springframework.stereotype.Component;

@Component
public class Event {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
