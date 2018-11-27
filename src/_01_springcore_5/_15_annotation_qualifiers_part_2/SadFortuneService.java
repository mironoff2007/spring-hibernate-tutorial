package _01_springcore_5._15_annotation_qualifiers_part_2;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a sad day";
	}

}
