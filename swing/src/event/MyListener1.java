package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//actionlistener
//JButton, JMenultem, JTextField ������Ʈ �̺�Ʈ ���
//JButton => ���콺�� enter ��ư ����
//JMenultem => �޴� ����
//JTextField => enterŰ �Է�

public class MyListener1 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//�׼��� �Ͼ ��ü�� command ������
		System.out.println("e.getActionCommand() "+e.getActionCommand());
		System.out.println("e.getID() "+e.getID());
		//�̺�Ʈ�� �Ͼ ��ü�� ���� ������ �ҷ���
		System.out.println("e.getActionCommand() "+e.getSource());

	}

}
