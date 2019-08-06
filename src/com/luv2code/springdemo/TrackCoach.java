package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	

	public TrackCoach() {
		super();
	}

	public TrackCoach(FortuneService theFortuneService) {
		super();
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "just do it: " + fortuneService.getFortune();
	}

	// add an init method
	public void doMyStartupStuff () {
		System.out.println("startup");
	}
	
	// add a destroy method
	public void doMyCleanup() {
		System.out.println("destroy");
	}
	
}
