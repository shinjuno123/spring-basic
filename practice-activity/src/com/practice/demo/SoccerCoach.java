package com.practice.demo;

public class SoccerCoach implements Coach{
	private RandomFortuneService randomFortuneService;
	
	
	
	public SoccerCoach(RandomFortuneService randomFortuneService) {
		this.randomFortuneService = randomFortuneService;
	}

	public String getDailyWorkout() {
		return "Kick a ball to goal post 30 times";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return randomFortuneService.getFortune();
	}
	
	public void initMethod() {
		System.out.println("init beans!");
	}
	
	public void destroyMethod() {
		System.out.println("destroy beans!");
	}
}
