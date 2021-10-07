package component;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.ImageIcon;

public class ButtonTest1 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton left,middle,right;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonTest1 frame = new ButtonTest1();
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

	public ButtonTest1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		left = new JButton("Disable middle button");
		left.setActionCommand("disable");
		left.addActionListener(this);
	
		//아이콘 설정하기
		left.setIcon(new ImageIcon(ButtonTest1.class.getResource("/component/left.gif")));
		
		//버튼이름 밑에 언더바 들어가기, alt+D 누르면 버튼이 눌림
		left.setMnemonic('D');
		contentPane.add(left);
		
		middle = new JButton("Middle button");
		middle.setActionCommand("middle");
		middle.addActionListener(this);
		middle.setIcon(new ImageIcon(ButtonTest1.class.getResource("/component/middle.gif")));
		middle.setMnemonic('M');
		contentPane.add(middle);
		
		right = new JButton("Enable middle button");
		right.setActionCommand("enable");
		right.addActionListener(this);
		right .setIcon(new ImageIcon(ButtonTest1.class.getResource("/component/right.gif")));
		right .setMnemonic('E');
		contentPane.add(right );
		
		//버튼의 크기에 맞게 자동 조절해줌
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//right.setActionCommand("enable");로 설정한 값을  가지고 옴
		String cmd = e.getActionCommand();
	//System.out.println(cmd);
		if (cmd.equals("disable")) {
			//disable 클릭 시 middle 버튼 비활성화
			//disable 버튼 비활성화, enable 버튼만 활성화
			middle.setEnabled(false);
			left.setEnabled(false);
			right.setEnabled(true);
			
		}else {
			//enable 클릭 시 middle 버튼 활성화
			//diaable 버튼 활성화, enable 버튼만 비활성화
			middle.setEnabled(true);
			left.setEnabled(true);
			right.setEnabled(false);
		}
			
	}

}
