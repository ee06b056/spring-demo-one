package com.luv2code.springdemo;

public class BadmintonCoach implements Coach {
	
	private FortuneService fortuneService;
	

	public BadmintonCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Play badminton for two hours.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	public void init() {
		System.out.println("init");
	}
	
	public void destroy() {
		System.out.println("destroy");
	}
}
