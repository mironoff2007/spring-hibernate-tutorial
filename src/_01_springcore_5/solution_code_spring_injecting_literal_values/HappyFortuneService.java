package _01_springcore_5.solution_code_spring_injecting_literal_values;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
