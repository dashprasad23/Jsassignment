package com.tyss.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.tyss.springcore.di.Hellow;
@Configuration
@Import(PetConfiguration.class)
public class ConfigurationClass {
	@Bean(name="hellow")
	public Hellow getHellow()
	{
		Hellow hw=new Hellow();
		hw.setMessage("I love js");
		return hw;
	}
	/*@Bean(name="Dog")
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
	}*/

}
