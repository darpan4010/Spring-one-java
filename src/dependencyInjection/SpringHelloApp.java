package dependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	
	public static void main(String[] args){
		
		//STEP NO 1:- Load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextDI.xml");

		//STEP NO 2:- Get the bean out of the container 		
		Coach thecoach = context.getBean("mycoach",Coach.class);
		
		//STEP NO 3:- Call the methods in the bean		
		System.out.println(thecoach.getDailyWorkout());
		System.out.println(thecoach.getTimings());
		System.out.println(thecoach.getDailyFortune());
		System.out.println(thecoach.getDailyFortune());
		
		//STEP NO 4:- Close the context
		context.close();
		
	}
}
