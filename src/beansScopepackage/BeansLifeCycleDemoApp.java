package beansScopepackage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansLifeCycleDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Load the xml file i.e. configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextInitDestroyBeansLifecycle.xml");
		
		//Retrieve the bean
		Coach theCoach = context.getBean("mycoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		context.close();
	}

}
