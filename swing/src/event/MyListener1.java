package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//actionlistener
//JButton, JMenultem, JTextField 컴포넌트 이벤트 담당
//JButton => 마우스나 enter 버튼 선택
//JMenultem => 메뉴 선택
//JTextField => enter키 입력

public class MyListener1 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//액션이 일어난 객체의 command 가져옴
		System.out.println("e.getActionCommand() "+e.getActionCommand());
		System.out.println("e.getID() "+e.getID());
		//이벤트가 일어난 객체에 대한 정보를 불러옴
		System.out.println("e.getActionCommand() "+e.getSource());

	}

}
