package _01_springcore_5._6_injecting_values_from_properties_file;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
