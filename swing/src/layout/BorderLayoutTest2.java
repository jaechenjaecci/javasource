package layout;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

//기본 레이아웃  BorderLayout으로 세팅, 가운데를 기준으로 붙여나감
//여러개가 겹쳐도 수행은 됨


public class BorderLayoutTest2 extends JFrame{
public BorderLayoutTest2() {
	setTitle("BorderLayout 테스트");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	Container container = getContentPane();
	container.setLayout(new BorderLayout(30, 20));
	
	
	JButton btn1 = new JButton("버튼1");
	add(btn1,BorderLayout.EAST);
	
	JButton btn2 = new JButton("버튼2");
	add(btn2,BorderLayout.SOUTH);
	
	JButton btn3 = new JButton("버튼3");
	add(btn3,BorderLayout.WEST);
	
	JButton btn4 = new JButton("버튼4");
	add(btn4,BorderLayout.CENTER);
	
	JButton btn5 = new JButton("버튼5");
	add(btn5,BorderLayout.NORTH);
	
	setSize(300,300);
	setVisible(true);
}
	
	public static void main(String[] args) {
		BorderLayoutTest2 f = new BorderLayoutTest2();
	}

}
