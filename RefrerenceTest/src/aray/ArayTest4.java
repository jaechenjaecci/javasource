package aray;

public class ArayTest4 {

	public static void main(String[] args) {
		int score []= {78,65,95,88,36,45,25,47,87,43};
		// 평균 = 합계 / 개수(score.length)

		int sum = 0;
//		for (int i = 0; i < score.length; i++) {
//			sum = sum + score[i]; // => sum+=score[i]
//
			
			
			for (int jumsu :score) {
				sum +=jumsu;
			}
		
		System.out.printf("합계 : %d, 평균 : %d점", sum, sum/score.length);
	}

}