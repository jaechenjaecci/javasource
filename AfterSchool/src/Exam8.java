
public class Exam8 {

	public static void main(String[] args) {
		// �迭 => ��(new)
		// �迭����
		int arr[]; 
		// ����
		arr = new int[10];		
		// �ʱ�ȭ
		for (int i = 0; i<arr.length; i++) {
		arr[i] = i+1;
		// i�� 1�� ��������� ������ ����ִ� 0�� ��µǴ� ���� �ƴ϶�
		// 1���� 1�� ������ ���ڰ� ����ǰ�, ��µ� 
			
		System.out.print(arr[i]+" ");
		}
		// ���

	}

}
