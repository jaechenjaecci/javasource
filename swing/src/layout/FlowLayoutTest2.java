package layout;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutTest2 extends JFrame{
public FlowLayoutTest2() {
	setTitle("BorderLayout 테스트");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
	Container container = getContentPane();
	//contentpane의 새로운 레이아웃 설정 => 보더 레이아웃을 플로어로 변경
	container.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
	//왼쪽을 기준으로 버튼을 정렬하되 버튼 사이의 간격을 설정가능
	
	JButton btn1 = new JButton("버튼1");
	add(btn1);
	
	JButton btn2 = new JButton("버튼2");
	add(btn2);
	
	JButton btn3 = new JButton("버튼3");
	add(btn3);
	
	JButton btn4 = new JButton("버튼4");
	add(btn4);
	
	JButton btn5 = new JButton("버튼5");
	add(btn5,BorderLayout.NORTH);
	
	setSize(300,200);
	setVisible(true);
}
	
	public static void main(String[] args) {
		FlowLayoutTest2 f = new FlowLayoutTest2();
	}

}
