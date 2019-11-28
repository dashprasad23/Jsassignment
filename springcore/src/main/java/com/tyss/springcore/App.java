package com.tyss.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tyss.springcore.di.Animal;
import com.tyss.springcore.di.Hellow;
import com.tyss.springcore.di.Pet;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
       Hellow hellow=context.getBean(Hellow.class);
       System.out.println(hellow.getMap());
       System.out.println(hellow.getMessage());
       Hellow hellow2=context.getBean(Hellow.class);
       System.out.println(hellow2);
      
       Hellow hellow4=context.getBean(Hellow.class);
       System.out.println(hellow4);
       Animal animal=context.getBean(Animal.class);
       animal.makeSound();
       Animal animal2=(Animal)context.getBean("dog");
       animal2.makeSound();
       Pet pet=context.getBean(Pet.class);
       System.out.println(pet.getName());
       pet.getAnimal().makeSound();
       
    }
}
