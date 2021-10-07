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
	
		//������ �����ϱ�
		left.setIcon(new ImageIcon(ButtonTest1.class.getResource("/component/left.gif")));
		
		//��ư�̸� �ؿ� ����� ����, alt+D ������ ��ư�� ����
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
		
		//��ư�� ũ�⿡ �°� �ڵ� ��������
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//right.setActionCommand("enable");�� ������ ����  ������ ��
		String cmd = e.getActionCommand();
	//System.out.println(cmd);
		if (cmd.equals("disable")) {
			//disable Ŭ�� �� middle ��ư ��Ȱ��ȭ
			//disable ��ư ��Ȱ��ȭ, enable ��ư�� Ȱ��ȭ
			middle.setEnabled(false);
			left.setEnabled(false);
			right.setEnabled(true);
			
		}else {
			//enable Ŭ�� �� middle ��ư Ȱ��ȭ
			//diaable ��ư Ȱ��ȭ, enable ��ư�� ��Ȱ��ȭ
			middle.setEnabled(true);
			left.setEnabled(true);
			right.setEnabled(false);
		}
			
	}

}
