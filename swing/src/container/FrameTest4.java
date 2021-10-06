package container;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameTest4 extends JFrame {
	public FrameTest4() {
		setTitle("MyFrame");
		//크기를 지정하지 않으면 타이틀모양만 뜸
		setSize(300, 300);
		
		//프레임을 닫으면 프로그램 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());
		//컴포넌트 : Jbutton, JcheckBox, JRadio,....
		JButton btn1 = new JButton("버튼1");
		add(btn1);
		//BorderLayout : 상,하,좌,우,가운데 설정가능
		
		JButton btn2 = new JButton("버튼2");
		add(btn2);
		
		JButton btn3 = new JButton("버튼3");
		add(btn3);
		
		JButton btn4 = new JButton("버튼4");
		add(btn4);
		
		JButton btn5 = new JButton("버튼5");
		add(btn5);
		
		//화면으로 보여지도록 하는 코드
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		FrameTest4 f = new FrameTest4();

	}

}
