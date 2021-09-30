package object;

public class Value {
	int value;

	public Value(int value) {
		super();
		this.value = value;
	}

	@Override
	public boolean equals(Object obj) { // value1.equals(value2) <= �̰� �ϸ�, object obj�� value2�� ����
		Value v = (Value) obj;
		//�ڽ� ��ü�� ����ȯ�� ��
		if (this.value == v.value) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		
		return value+"";
	}//int���� ���ڿ��� �����ϰ� �ʹٸ� �ڿ� ū�ֵ���ǥ�� ����
}