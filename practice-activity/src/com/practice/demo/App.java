package com.practice.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach myCoach1 = context.getBean("myCoach",Coach.class);
		
		Coach myCoach2 = context.getBean("myCoach",Coach.class);
		
		
		System.out.println(myCoach1.getDailyFortune());
		
		System.out.println("Are myCoach1 and 2 singleton cope?: " + (myCoach1 == myCoach2));
		
		context.close();

	}

}
