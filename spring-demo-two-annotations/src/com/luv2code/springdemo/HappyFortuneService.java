package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component 
public class HappyFortuneService implements FortuneService {

	public String getDailyFortune() {
		
		return "Today is your lucky day!";
	}

}
