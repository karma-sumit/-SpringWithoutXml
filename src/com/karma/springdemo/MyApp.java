package com.karma.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.karma.config.AppConfig;
import com.karma.model.Coach;

public class MyApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		System.out.println("Workout :- "+theCoach.getDailyWorkout());
		System.out.println("Fortune :- " + theCoach.getDailyFortune());
	}

}
