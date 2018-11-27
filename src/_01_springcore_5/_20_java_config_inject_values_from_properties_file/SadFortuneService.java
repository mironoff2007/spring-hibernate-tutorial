package _01_springcore_5._20_java_config_inject_values_from_properties_file;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a sad day";
	}

}
