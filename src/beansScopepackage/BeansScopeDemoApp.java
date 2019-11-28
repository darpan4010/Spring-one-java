package beansScopepackage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Load the xml file i.e. configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextBeansScope.xml");
		
		Coach theCoach = context.getBean("mycoach", Coach.class);
		Coach theCoach1 = context.getBean("mycoach", Coach.class);
		
		
		//check if both the beans are pointing same reference of memory
		
		boolean result = (theCoach == theCoach1);
		
		System.out.println("Pointing out the same object in memory:- "+result);
		
		System.out.println("Memory location of theCoach:-  "+theCoach);
		System.out.println("Memory location of theCoach1:- "+theCoach1);
		
		context.close();
	}

}
