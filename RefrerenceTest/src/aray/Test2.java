package aray;

public class Test2 {

	public static void main(String[] args) {
		// �迭�� ������ ũ�⸦ �����ϴ°� �߿�, ���߿� �߰� ������ ������ �� ���� 
		// => �ٽ� ������ �����ؾ���(�����Ͼ�°� ���α׷��� ��������)
		
		int oldArr[] = {10,20,30}; //3�� ����߿� �ϳ� �� �ʿ��� ����
		int newArr[] = new int[4];
		//���� �� ���ο� ������ ����
//		for(int i=0; i<oldArr.length;i++) {
//			newArr[i]=oldArr[i]; //������ ����
//		}
		
	System.arraycopy(oldArr, 0, newArr, 0, oldArr.length);	

	//�ڹٰ� ������ִ� ���		
// (������ ��,���ҽ��� ������ ������ �� ��ġ����,�̵��� ��,�̵��� �� �� ��� �ű���,��� �ű���)   		
		
		
		newArr[3] = 40;
		for(int i : newArr) {
			System.out.print(i+" ");
		}
	}

}
