
public class Won2Dollar extends Converter {

	@Override
	protected double convert(double src) {
		return src/1200;
	}
	@Override
	protected String getSrcString() {
		return "¿ø";
	}

	@Override
	protected String getDestString() {
		
		return "´Þ·¯";
	}

}
