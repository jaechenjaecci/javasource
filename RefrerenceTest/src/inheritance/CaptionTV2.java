package inheritance;

public class CaptionTV2 extends TV2 {

	public CaptionTV2(String color, boolean power, int channel) {
		super(color, power, channel);
		
	}

	boolean caption;

	void displayCaption(String text) {
		if (caption) {
			// caption == true의 의미와 같음
			System.out.println(text);
		}
	}

}
