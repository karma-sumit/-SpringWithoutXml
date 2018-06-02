package com.karma.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.karma.service.FortuneService;
@Component("tennisCoach")
public class TennisCoach implements Coach {
	@Autowired
	FortuneService fortuneService;
	@Value("${app.email}")
	private String email;
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Do cardio for 15mins";
	}
	
	public String getEmail() {
		return email;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	
	
}
