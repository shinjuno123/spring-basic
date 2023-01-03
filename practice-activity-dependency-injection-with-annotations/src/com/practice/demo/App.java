package com.practice.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// load xml configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// load tennisCoach object
		Coach tenniseCoach = context.getBean("tennisCoach",Coach.class);
		
		// get daily fortune
		System.out.println(tenniseCoach.getDailyFortune());
		
		// close context
		context.close();
		
	}

}
