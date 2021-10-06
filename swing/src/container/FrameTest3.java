package container;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameTest3 extends JFrame {
	public FrameTest3() {
		setTitle("MyFrame");
		setSize(300, 300);

		//컴포넌트 : Jbutton, JcheckBox, JRadio,....
		JButton btn1 = new JButton("버튼1");
		add(btn1,BorderLayout.EAST);
		//BorderLayout : 상,하,좌,우,가운데 설정가능
		
		JButton btn2 = new JButton("버튼2");
		add(btn2,BorderLayout.SOUTH);
		
		JButton btn3 = new JButton("버튼3");
		add(btn3,BorderLayout.WEST);
		
		JButton btn4 = new JButton("버튼4");
		add(btn4,BorderLayout.CENTER);
		
		JButton btn5 = new JButton("버튼5");
		add(btn5,BorderLayout.NORTH);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		FrameTest3 f = new FrameTest3();

	}

}
