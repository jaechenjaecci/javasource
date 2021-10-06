package event;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame2 extends JFrame implements ActionListener {

	private JButton btn1,btn2;
	JLabel lbl = new JLabel("버튼을 누르세요");
	public MyFrame2() {
	setTitle("액션이벤트");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	setLayout(new FlowLayout());
	
	btn1 = new JButton("click");
	//버튼이 클릭되나 안되나 감시하는 이벤트 리스너를 버튼에 부착
	btn1.addActionListener(this);
	lbl = new JLabel("버튼을 누르세요");
	add(btn1);
	
	add(lbl);

	btn2 = new JButton("click2");
	btn2.addActionListener(this);
	add(btn2);
		
	setBounds(100,100,300,200);
	setVisible(true);
}
	public static void main(String[] args) {
		new MyFrame2();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {
		lbl.setText("1번 버튼 클릭");
			//System.out.println("버튼이 눌러졌습니다.");
		}else if(e.getSource()==btn2) {
			lbl.setText("2번 버튼 클릭");
			//System.out.println("두번째 버튼이 눌러졌습니다.");
			
		}
		
	}

}
