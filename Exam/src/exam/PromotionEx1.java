package exam;

public class PromotionEx1 {

	public static void main(String[] args) {
		// ���� ����
		// ����Ÿ�� => byte(1byte) < char(2byte) < short(2byte) < int(4byte) < long(8byte)
		//           2^8(256) = 8bit
		// �Ǽ�Ÿ�� => float(4byte) < double(8byte)
		byte byteValue = 10; // byte�ȿ� -127~127������ �Է� �����ѵ� 128�� ������ ����
		
		
		//�ڵ�����ȯ(promotion) : ���� ���� ū �׸����� �ű� ���, �������� ��ȭ�� ����
		int intValue = byteValue; //byte�� int�� �Ű� ����
		System.out.println(intValue);
		
		intValue = 500;
		long longValue = intValue;
		char charValue = 'A';
		char charValue2 = 1;
		
		int charValue3 = charValue+charValue2; //'A'+1
		
		
		System.out.println(charValue3); 
		// =66 (?�ƽ�Ű�ڵ� A=65�̱⶧���� ���� ���� 66�� ����� ���� 
		// �빮�� A�� 65, �ҹ��� a�� 97���̶� ����ϰŶ�
		
		// ��������ȯ(casting)
		// int�� ������ char�� ��ȯ��Ŵ
		System.out.println((char)charValue3);
		// =B ���ڷ� ������ ��ȯ�Ͽ� ����
		
		
		
	}

}
