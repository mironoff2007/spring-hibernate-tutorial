package _01_springcore_5._1_rough_prototype;

import _01_springcore_5._4_setter_injection.HappyFortuneService;

public class TrackCoach implements Coach {

	public TrackCoach(HappyFortuneService happyFortuneService) {
	}

    public TrackCoach() {

    }

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}


}










