package dependencyInjection;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//Add 2 new private variables for setting literals
	
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside the setter method:- setEmailAddress ");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Inside the setter method:- setTeam ");
		this.team = team;
	}

	//create a no-arg constructor
	public  CricketCoach() {
	System.out.println("Inside the constructor:- CricketCoach");
	}
	
	//Setter method will be called by spring while injecting the dependency.
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside the setter method:- setFortuneService ");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practive fast bowling for 15 mins";
	}

	@Override
	public String getTimings() {
		// TODO Auto-generated method stub
		return "Cricket Morning 9am";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
