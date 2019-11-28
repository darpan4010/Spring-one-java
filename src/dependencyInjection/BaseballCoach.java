package dependencyInjection;

public class BaseballCoach implements Coach {

	//Define the private field for dependency.
	private FortuneService fortuneService;
	
	//Create a constructor for dependency injection.
	public BaseballCoach(FortuneService thefortuneService) {
		// TODO Auto-generated constructor stub
		fortuneService = thefortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "BaseballCoach:- Daily warmup for 30 mins";
	}

	@Override
	public String getTimings() {
		// TODO Auto-generated method stub
		return "BaseballCoach:- Morning time";
	}

	@Override
	public String getDailyFortune() {

		//use my fortuneService to get the fortune
		// Dependency = helper class
		return fortuneService.getFortune();
	}
	
	

}
