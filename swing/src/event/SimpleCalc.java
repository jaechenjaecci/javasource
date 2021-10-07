package event;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalc extends JFrame implements ActionListener {

	private JTextField num1, num2, result;

	public SimpleCalc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("덧셈 계산기");

		// 상단 부착 패널 생성
		JPanel top = new JPanel();

		// 숫자를 입력하고 결과를 출력할 텍스트 필드 생성
		num1 = new JTextField(10);
		top.add(num1);

		JLabel op = new JLabel("+");
		top.add(op);

		num2 = new JTextField(10);
		top.add(num2);

		JLabel op2 = new JLabel("=");
		top.add(op2);

		result = new JTextField(10);
		top.add(result);

		add(top, BorderLayout.NORTH);

		// 하단 부착 패널
		JPanel bottom = new JPanel();

		// 버튼 2개 생성 후 add
		JButton btnOk = new JButton("확인");
		btnOk.addActionListener(this);
		JButton btnReset = new JButton("취소");
		btnReset.addActionListener(this);

		bottom.add(btnOk);
		bottom.add(btnReset);

		add(bottom, BorderLayout.CENTER);

		setSize(450, 150);
		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("확인")) {
			// 확인 버튼 클릭, num1과 num2에 있는 값 가져오기 "11" = 11
			// NumberFormatException이 날 수 있음, try-catch 이용

			try {
				int op1 = Integer.parseInt(num1.getText());
				int op2 = Integer.parseInt(num2.getText());

				// 가져온 숫자를 덧셈
				int total = op1 + op2;

				// 결과를 result에 보여주기 11 => "11"
				result.setText(String.valueOf(total));

			} catch (Exception e2) {
				// 개발할 때는 예외 발생 단계 출력
				// e2.printStackTrace();
				// 사용자에게 메세지 출력, 새로운 팝업창으로 메시지 전달
				JOptionPane.showMessageDialog(getParent(),"입력값을 확인해주세요");
			}
		} else {
			// 취소버튼 클릭
			// num1,2,result에 현재 들어있는 값 지우기
			num1.setText("");
			num2.setText("");
			result.setText("");
		}

	}

	public static void main(String[] args) {
		new SimpleCalc();

	}

}
