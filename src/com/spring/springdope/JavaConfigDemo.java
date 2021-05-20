package com.spring.springdope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemo {

	public static void main(String[] args) {
		
		// read spring config file
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from the spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		FootCoach alphaCoach = context.getBean("thatDopeCoach", FootCoach.class);
		
		// call a method on the bean 
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(alphaCoach.getWork());
		
		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
