package dependencyInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//STEP NO 1:- Load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextDI.xml");
		
		//STEP NO 2:- Get the bean out of the container 		
		CricketCoach thecricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
			
		//STEP NO 3:- Call the methods in the bean	
		//System.out.println(thecricketCoach.getDailyWorkout());
		//System.out.println(thecricketCoach.getDailyFortune());
		
		System.out.println(thecricketCoach.getEmailAddress());
		System.out.println(thecricketCoach.getTeam());

		
		//STEP NO 4:- Close the context
		context.close();
	}

}
