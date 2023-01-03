package com.practice.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		
		// load config class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		// retrieve swimCoach object
		Coach swimCoach1 = context.getBean("swimCoach",Coach.class);
		Coach swimCoach2 = context.getBean("swimCoach",Coach.class);
		
		// print out daily fortune
		System.out.println(swimCoach1.getDailyFortune());
		
		
		// check if a retrieved object is singleton
		System.out.println("Is this singleton ? : " + (swimCoach1 == swimCoach2));
	}

}
