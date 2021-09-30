package aray;

public class ArayTest7 {
public static void main(String[] args) {
	int score []= {78,65,95,88,36,45,25,47,87,43};

//최고 점수, 최저점수 출력하기, 각자 비교를 해야하기 때문에 for문을 돌려야함
//두개의 방을 만든 후 첫번째 숫자를 그 방에 입력한 후 두번째 
	
	int max = score[0];
	int min = score[0];
	
	for(int i =1; i<score.length;i++) {
		if (max < score[i]) {
			max = score[i];
		} else if (score[i] < min) {
			min = score[i];
		}
	}
System.out.printf("최고점수 : %d, 최저점수 : %d", max,min);
	
	}

	




}