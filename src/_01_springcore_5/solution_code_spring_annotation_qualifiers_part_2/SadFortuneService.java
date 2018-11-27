package _01_springcore_5.solution_code_spring_annotation_qualifiers_part_2;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a sad day";
	}

}
