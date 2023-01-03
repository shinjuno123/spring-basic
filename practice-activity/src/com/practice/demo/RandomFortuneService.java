package com.practice.demo;

public class RandomFortuneService implements FortuneService {
	String[] fortunes = {"You have a good day today", "Good", "Great!"};
	
	
	@Override
	public String getFortune() {
		int randomIndex = (int) Math.floor(Math.random() * 3);
		
		return fortunes[randomIndex];
	}

}
