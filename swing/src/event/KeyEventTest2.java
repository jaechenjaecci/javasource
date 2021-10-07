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

// KeyListener : Ű�̺�Ʈ�� �����ϴ� ������, ��Ŀ���� ���� ������Ʈ������ �߻�
// keyPressed() : Ű�� ������ ���� �߻�
// 			keyTyped() : ����Ű�� �������� ���� ȣ�� (��, �����ڵ��� ��츸 ȣ��)
//                     : ȣ���� �ȵ� ���� ����
// keyReleased() : ����Ű�� ���� ���� ȣ��

public class KeyEventTest2 extends JFrame {
	
	private JPanel panel;
	private JTextField textField;
	private JTextArea textArea;
	
	

	public KeyEventTest2() {
		panel = new JPanel();
		panel.setLayout(new GridLayout(0, 2));
		
		panel.add(new JLabel("���ڸ� �Է��ϼ���"));

		textField = new JTextField(10);
		textField.addKeyListener(new MyKeyListener());
		panel.add(textField);

		textArea = new JTextArea(3, 30);

		getContentPane().add(panel, BorderLayout.NORTH);
		getContentPane().add(textArea, BorderLayout.CENTER);

		setTitle("Ű �̺�Ʈ");
		setSize(400, 200);
		setVisible(true);

	}

	protected void display(KeyEvent e, String str) {
	//���� ������ Ű�� ���ڰ�
	char keyChar = e.getKeyChar();
	//���� ������ Ű�� �ڵ尪
	int keyCode = e.getKeyCode();
	
	String modifiers = "Alt : " +e.isAltDown()+" Ctrl : " +e.isControlDown()
	+ "Shift : " +e.isShiftDown();
	textArea.append(str+" ���� : "+keyChar+" (�ڵ� : "+keyCode+") "+modifiers+"\n");
	}
	
	public static void main(String[] args) {
		//main���� KeyEventTest2();�� �����ϸ� �ؿ� �ִ� MyKeyListener�� ����� �� ����
		new KeyEventTest2();

	}

	//Ŭ���� �ȿ� Ŭ������ ���� : ��øŬ����(inner class)
	class MyKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
			display(e, "keypressed : ");
		}
	}



	
	
	
	
	
}
