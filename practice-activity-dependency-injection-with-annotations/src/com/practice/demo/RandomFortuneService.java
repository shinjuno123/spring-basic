package com.practice.demo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] fortunes;
	
	@Value("${foo.fortunes}")
	public void setFortunes(String[] fortunes) {
		this.fortunes = fortunes;
	}
	
	
	private Random random = new Random();

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		System.out.println("Length of fortune quotes: " + fortunes.length);
		
		int randomIndex = random.nextInt(fortunes.length);
		
		return fortunes[randomIndex];
	}

}
