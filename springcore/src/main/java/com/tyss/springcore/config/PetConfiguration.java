package com.tyss.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tyss.springcore.di.Cat;
import com.tyss.springcore.di.Dog;
import com.tyss.springcore.di.Pet;

@Configuration
public class PetConfiguration {
	@Bean(name="Dog")
	public Dog getDog()
	{
		return new Dog();
		
	}
	@Bean(name="Cat")
	public Cat getCat()
	{
		return new Cat();
	}
	@Bean(name="Pet")
	public Pet getPet()
	{
		Pet pet=new Pet();
		pet.setName("Bittu");
		pet.setAnimal(getDog());
		return pet;
	}

}
