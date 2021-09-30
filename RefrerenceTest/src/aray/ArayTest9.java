package aray;

import javax.jws.soap.SOAPBinding;

public class ArayTest9 {
	public static void main(String[] args) {
		int score[][] = {
				// �� �迭�� ���� �հ踦 ���϶�,
				// �հ踦 ���� �迭�� ���� ����(1), ������ �̵�(2), �հ豸�ϱ�(3)
				{ 100, 100, 100 }, { 20, 20, 20 }, { 30, 40, 30 }, { 40, 50, 20 }, { 50, 60, 50 } };

		int result[][] = new int[score.length + 1][score[0].length + 1];
		// �̷��� �ص� �ǳ�, �Ź� ������ �ʿ� new int[6][4];

		//���� �� ����
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				result[i][j] = score[i][j];

				// ���հ�
				result[i][result[i].length - 1] += result[i][j];

				// ��ü�հ�
				result[result.length - 1][result[i].length - 1] += score[i][j];
			}

			// �� �հ�
			result[result.length - 1][0] += result[i][0];
			result[result.length - 1][1] += result[i][1];
			result[result.length - 1][2] += result[i][2];
		
		}
		// �ڵ� Ȯ��
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%5d", result[i][j]);

			}
			System.out.println(); //�� ������ ��� ���ڰ� ���η� ��µ�
		}
	}
}
