package looptext;
//2차원으로 하려면 for문이 2개가 필요함
// ex. 행과 열이 있는 경우

// 이중 for문 실행 순서
// 1. int i = 0 
// 2. i < 3
// 3. 안쪽 for문 int j = 0
// 4. j < 3
// 5. System.out.print("*"); *
// 6. j++ => 1
// 7. j < 3
// 8. System.out.print("*"); **
// 9. j++ => 2
// 10. j < 3
// 11. System.out.print("*"); ***
// 12. j++ => 3  : 안쪽 for문 종료
// 13. System.out.println();

// 1. i++ => 1
// 2. 3~13번 실행  *** *2줄

// 1. i++ => 2
// 2. 3~13번 실행  *** *3줄

// 1. i++ => 3  : 바깥 for문 종료

public class ForTest5 {
public static void main(String[] args) {
	for (int i = 0; i < 5; i++) {
	for (int j = 0; j < 10; j++) {
		System.out.print("*");
	}
	System.out.println();
	}
}
}
