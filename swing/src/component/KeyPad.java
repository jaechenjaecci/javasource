package component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridLayout;


public class KeyPad extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JButton[] buttons = new JButton[9];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KeyPad frame = new KeyPad();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public KeyPad() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 310, 246);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		//패널의 버튼 9개 부착
		for(int i=0; i<buttons.length;i++) {
			buttons[i] = new JButton((i+1)+"");
		//버튼 위에 글씨 크기 조절
		buttons[i].setFont(new Font("굴림",Font.PLAIN,24));
		//액션 리스너
		buttons[i].addActionListener(this);
		panel.add(buttons[i]);
			
			
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//버튼이 클릭되면 눌러진 버튼의 숫자 가져오기
		String cmd = e.getActionCommand();
		
		//가져온 숫자를 텍스트 필드에 보여주기
		//기존에 있는 숫자를 가져와서 현재 누른 숫자랑 연결해서 보여주기
		textField.setText(textField.getText()+cmd);
		
		
	}

}
