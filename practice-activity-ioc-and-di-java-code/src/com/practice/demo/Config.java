package com.practice.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public FortuneService fortuneService() {
		return new HappyFortuneService();
	}
	
	@Bean
	public SwimCoach swimCoach() {
		SwimCoach swimCoach =  new SwimCoach();
		swimCoach.setFortuneService(fortuneService());
		return swimCoach;
	}
}
