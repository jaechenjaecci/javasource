package looptext;

import java.io.IOException;

public class WhileTest3 {
	public static void main(String[] args) throws IOException {
		boolean run = true;
		int keyCode = 0, speed = 0;
		while (run) {
			if (keyCode != 13 && keyCode != 10) {
				// 13=> CR && 10=>LF : ����(CR,LF�� ������)
				System.out.println("========================");
				System.out.println("1. ���� | 2. ���� | 3. ����");
				System.out.println("========================");
				System.out.print("���� : ");

			}
			keyCode = System.in.read(); 
			//(�ƽ�Ű�ڵ�) 1=>49, 2=>50, 3=>51
			if (keyCode == 49) {
				speed++;
				System.out.println("���� �ӵ� = " + speed);
			} else if (keyCode == 50) {
				speed--;
				System.out.println("���� �ӵ� = " + speed);
			} else if (keyCode == 51) {
				run = false;

			}
		}
		System.out.println("���α׷� ����");
	}
}
