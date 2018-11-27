package _01_springcore_5._10_annotation_default_component_names;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
