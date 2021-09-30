package aray;

import javax.jws.soap.SOAPBinding;

public class ArayTest9 {
	public static void main(String[] args) {
		int score[][] = {
				// 각 배열의 수의 합계를 구하라,
				// 합계를 넣을 배열을 새로 생성(1), 기존값 이동(2), 합계구하기(3)
				{ 100, 100, 100 }, { 20, 20, 20 }, { 30, 40, 30 }, { 40, 50, 20 }, { 50, 60, 50 } };

		int result[][] = new int[score.length + 1][score[0].length + 1];
		// 이렇게 해도 되나, 매번 수정이 필요 new int[6][4];

		//기존 값 복사
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				result[i][j] = score[i][j];

				// 행합계
				result[i][result[i].length - 1] += result[i][j];

				// 전체합계
				result[result.length - 1][result[i].length - 1] += score[i][j];
			}

			// 열 합계
			result[result.length - 1][0] += result[i][0];
			result[result.length - 1][1] += result[i][1];
			result[result.length - 1][2] += result[i][2];
		
		}
		// 코드 확인
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%5d", result[i][j]);

			}
			System.out.println(); //얘 없으면 모든 숫자가 가로로 출력됨
		}
	}
}
