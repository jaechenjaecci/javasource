package looptext;
//2�������� �Ϸ��� for���� 2���� �ʿ���
// ex. ��� ���� �ִ� ���

// ���� for�� ���� ����
// 1. int i = 0 
// 2. i < 3
// 3. ���� for�� int j = 0
// 4. j < 3
// 5. System.out.print("*"); *
// 6. j++ => 1
// 7. j < 3
// 8. System.out.print("*"); **
// 9. j++ => 2
// 10. j < 3
// 11. System.out.print("*"); ***
// 12. j++ => 3  : ���� for�� ����
// 13. System.out.println();

// 1. i++ => 1
// 2. 3~13�� ����  *** *2��

// 1. i++ => 2
// 2. 3~13�� ����  *** *3��

// 1. i++ => 3  : �ٱ� for�� ����

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
