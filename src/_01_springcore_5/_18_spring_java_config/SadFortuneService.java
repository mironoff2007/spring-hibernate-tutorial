package _01_springcore_5._18_spring_java_config;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a sad day";
	}

}
