package _01_springcore_5.solution_code_spring_java_config_inject_values_from_properties_file;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day!";
	}

}
