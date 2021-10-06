package layout;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//flowlayout : 컴포넌트를 왼쪽에서 오른쪽으로 배치
//           : 오른쪽 공간이 없으면 아래로 내려감



public class FlowLayoutTest1 extends JFrame{
public FlowLayoutTest1() {
	setTitle("BorderLayout 테스트");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//레이아웃 변경 
	//1.setlayout(new FlowLayout)
	//2.현재 프레임의 contentpane 가져오기 => BorderLayout
//	Container container = getContentPane();
	//contentpane의 새로운 레이아웃 설정 => 보더 레이아웃을 플로어로 변경
//	container.setLayout(new FlowLayout());
	//3.JFrame : 최소화, 최대화, 닫기 등의 버튼을 만들때 주소 사용
	//컴포넌트에 패널을 붙임
	
	JPanel panel = new JPanel(); //기본 레이아웃이 flowlayout
	//panel.setLayout(mgr);
	setContentPane(panel);
	
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
	
	setSize(300,300);
	setVisible(true);
}
	
	public static void main(String[] args) {
		FlowLayoutTest1 f = new FlowLayoutTest1();
	}

}
