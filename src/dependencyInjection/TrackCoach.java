package dependencyInjection;

public class TrackCoach implements Coach {

	
	private FortuneService fortuneService;
	
	//Constructor
	public TrackCoach(FortuneService fortuneService) {
	
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "TrackCoach:- Run 5 km";
	}

	@Override
	public String getTimings() {
		// TODO Auto-generated method stub
		return "TrackCoach:- Evening time";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "TrackCoach:-"+fortuneService.getFortune();
	}

}
