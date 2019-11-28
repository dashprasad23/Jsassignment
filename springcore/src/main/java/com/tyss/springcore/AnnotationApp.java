package com.tyss.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyss.springcore.config.ConfigurationClass;
import com.tyss.springcore.di.Animal;
import com.tyss.springcore.di.Hellow;
import com.tyss.springcore.di.Pet;

public class AnnotationApp {
	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(ConfigurationClass.class);
		Hellow hellow=context.getBean(Hellow.class);
		System.out.println(hellow.getMessage());
		Hellow hellow2=context.getBean(Hellow.class);
		System.out.println(hellow);
		System.out.println(hellow2);
		System.out.println("*******************************************");
		Animal animal=context.getBean(Animal.class);
		animal.makeSound();
		System.out.println("************************************");
		Pet pet=context.getBean(Pet.class);
		System.out.println(pet.getName());
		pet.getAnimal().makeSound();
		
	}

}
