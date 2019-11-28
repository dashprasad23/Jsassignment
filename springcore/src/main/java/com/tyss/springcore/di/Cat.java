package com.tyss.springcore.di;

import org.springframework.stereotype.Component;

@Component("Cat")
public class Cat implements Animal{

	@Override
	public void makeSound() {
		System.out.println("Meeeeeaooooooooooooooooooooooooooooooo");
		
	}

}
