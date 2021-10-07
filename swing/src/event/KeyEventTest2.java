package event;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// KeyListener : 키이벤트를 감지하는 리스너, 포커스를 가진 컴포넌트에서만 발생
// keyPressed() : 키를 누르는 순간 발생
// 			keyTyped() : 누른키가 떼어지는 순간 호출 (단, 유니코드인 경우만 호출)
//                     : 호출이 안될 수도 있음
// keyReleased() : 누른키를 떼는 순간 호출

public class KeyEventTest2 extends JFrame {
	
	private JPanel panel;
	private JTextField textField;
	private JTextArea textArea;
	
	

	public KeyEventTest2() {
		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 2));
		
		panel.add(new JLabel("문자를 입력하세요"));

		textField = new JTextField(10);
		textField.addKeyListener(new MyKeyListener());
		panel.add(textField);

		textArea = new JTextArea(3, 30);

		getContentPane().add(panel, BorderLayout.NORTH);
		getContentPane().add(textArea, BorderLayout.CENTER);

		setTitle("키 이벤트");
		setSize(400, 200);
		setVisible(true);

	}

	protected void display(KeyEvent e, String str) {
	//현재 눌러진 키의 문자값
	char keyChar = e.getKeyChar();
	//현재 눌러진 키의 코드값
	int keyCode = e.getKeyCode();
	
	String modifiers = "Alt : " +e.isAltDown()+" Ctrl : " +e.isControlDown()
	+ "Shift : " +e.isShiftDown();
	textArea.append(str+" 문자 : "+keyChar+" (코드 : "+keyCode+") "+modifiers+"\n");
	}
	
	public static void main(String[] args) {
		//main에서 KeyEventTest2();를 선언하면 밑에 있는 MyKeyListener도 사용할 수 있음
		new KeyEventTest2();

	}

	//클래스 안에 클래스가 존재 : 중첩클래스(inner class)
	class MyKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			display(e, "keypressed : ");
		}
	}



	
	
	
	
	
}
