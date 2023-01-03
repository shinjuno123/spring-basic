package com.practice.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// load configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// load corresponding class
		Coach myCoach = context.getBean("tennisCoach",Coach.class);
		
		// print out method
		System.out.println(myCoach.getWorkout());
		
		
		context.close();

	}

}
