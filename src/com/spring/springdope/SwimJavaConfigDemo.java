package com.spring.springdope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemo {

	public static void main(String[] args) {
		
		// read spring config file
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from the spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call a method on the bean 
		System.out.println(theCoach.getDailyWorkout());
		
		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// call our new swim coach methods... has the props values injected
		System.out.println("email: " + theCoach.getEmail());
		System.out.println("team: " + theCoach.getTeam());
		
		// close the context
		context.close();
	}

}
