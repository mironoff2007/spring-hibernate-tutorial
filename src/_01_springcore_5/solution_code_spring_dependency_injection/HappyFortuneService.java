package _01_springcore_5.solution_code_spring_dependency_injection;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
