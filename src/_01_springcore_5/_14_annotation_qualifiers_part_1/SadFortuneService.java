package _01_springcore_5._14_annotation_qualifiers_part_1;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a sad day";
	}

}
