package inheritance;

public class CaptionTV extends TV {

	boolean caption;

	void displayCaption(String text) {
		if (caption) {
			// caption == true의 의미와 같음
			System.out.println(text);
		}
	}

}
