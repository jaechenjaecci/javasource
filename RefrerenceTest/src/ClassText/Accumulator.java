package ClassText;

public class Accumulator {
	static {
		try {
			Class.forName("");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	int total = 0;
	static int grandTotal = 0;
	
	void accumulate(int amount) {
	//static으로 된 변수 부를 수 있음
		total += amount;
		grandTotal += amount;

	}

	static void print() {
		// total
	}
}
