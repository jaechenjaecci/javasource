package ClassText;

public class CarEx2 {

	public static void main(String[] args) {

		// ù��° ��
		// ��ü ���� �� �����ڰ� �ڵ� ȣ���
		Car2 car = new Car2();
		// �⺻�Ӽ� ���� Null, 0, false, 0.0�� �������

		/*
		 * car.company = "����"; car.model = "KONA"; car.color = "red"; car.maxSpeed =
		 * 200;
		 */

		// �ι�° �� : ���ο� ���� ������ �� �Ӽ��鸸 �������ָ� ��
		// ��ü ���� �� �����ڰ� �ڵ� ȣ���
		Car2 car2 = new Car2("kona");
		// �������� �ʴ� ������ null �� ������ �����Ǿ� ����
		
		
		//����° ��
		Car2 car3 = new Car2("kona", "black");
		
		//�׹�°��
		Car2 car4 = new Car2("����","kona", "black",250);

		/*
		 * car.company = "����"; // The field Car2.company is not visible
		 * 
		 * car.model = "��Ÿ��"; car.color = "black"; car.maxSpeed = 250;
		 */

	}

}
