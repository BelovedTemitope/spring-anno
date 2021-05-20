package com.spring.springdope;

import org.springframework.stereotype.Component;

@Component("thatDopeCoach") // this BeanID is specified, can use a default one 'footCoach'
public class FootCoach {
	public String getWork() {
		return "Go get to work";
	}
}
