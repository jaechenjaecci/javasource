package object;

public class Value {
	int value;

	public Value(int value) {
		super();
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) { // value1.equals(value2) <= 이걸 하면, object obj에 value2가 들어옴
		Value v = (Value) obj;
		//자식 객체로 형변환을 함
		if (this.value == v.value) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		
		return value+"";
	}//int값을 문자열로 변경하고 싶다면 뒤에 큰쌍따옴표를 붙임
}