package com.luv2code.springdemo;

public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		int random_index = (int) Math.floor(Math.random() * 3);
		System.out.println(random_index);
		String[] fortunes = {"one", "two", "three"};
		return fortunes[random_index];
	}

}
