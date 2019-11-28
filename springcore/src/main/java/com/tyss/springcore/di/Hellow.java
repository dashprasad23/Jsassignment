package com.tyss.springcore.di;

import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Hellow {
	private String message;
    private	Map<String,Integer> map;
    public Map<String,Integer> getMap()
	{
		return map;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	@PostConstruct
	public void init()
	{
		System.out.println("Init() method from hellow");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("Destroy() method from hellow");
	}

}
