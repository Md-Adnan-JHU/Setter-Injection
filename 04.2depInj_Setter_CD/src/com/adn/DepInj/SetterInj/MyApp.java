package com.adn.DepInj.SetterInj;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MyApp {
	public static void main(String[] args) {
//		load Spring config file & create Spring Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Retrieve beans from container
		Coach coach = context.getBean("myCoach", CricketCoach.class);
//		call methods on the bean
		System.out.println(coach.DailyWork());
		System.out.println(coach.getEquipments());
		
//	close the context
		context.close();
		
	}

}
