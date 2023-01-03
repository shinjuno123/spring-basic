package com.practice.demo;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Override
	public String getWorkout() {
		// TODO Auto-generated method stub
		return  "Practice your backhand volley";
	}

}
