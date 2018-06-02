package com.karma.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.karma.config.AppConfig;
import com.karma.model.Coach;
import com.karma.model.TennisCoach;

public class MyApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		TennisCoach theCoach = context.getBean("tennisCoach",TennisCoach.class);
		
		System.out.println("Workout :- "+theCoach.getDailyWorkout());
		System.out.println("Fortune :- 	" + theCoach.getDailyFortune());
		System.out.println("email :" + theCoach.getEmail());
	}

}
