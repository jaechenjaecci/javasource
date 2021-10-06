package layout;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//GridLayout : 격자모양으로 나옴, 테이블모양(행과 열의 개수가 필요)

public class GridLayoutTest1 extends JFrame {
	public GridLayoutTest1() {
		setTitle("Gridlayout 테스트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 레이아웃 변경
		Container container = getContentPane();
		container.setLayout(new GridLayout(3, 4, 5, 5));
		// 행과 열을 줘야하고, 그 사이 간격도 설정가능

		// 버튼 10개 생성
		for (int i = 0; i < 12; i++) {
			JButton btn = new JButton(i + "");
			add(btn);
		}

		setSize(500, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GridLayoutTest1();
	}

}
