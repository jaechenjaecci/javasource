package event;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventTest3 extends JFrame {

	   // Ű�����̺�Ʈ �����ʸ� ���콺 �̺�Ʈ �����ʷ� �����غ���
	   private JLabel lbl = new JLabel("HELLO");
	   
	   public MouseEventTest3() {
	      setTitle("�ؽ�Ʈ �����̱�");
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      // ���� ������ ���̾ƿ� ���ֱ�
	      setLayout(null);
	      
	      // ���̾ƿ��� ���ָ� ��ġ�� �� �� ��� �������� ��ǥ�� �����ؾ��Ѵ�
	      // ���̺� ��ġ
	      lbl.setLocation(50, 50); // ���̺� ��ǥ
	      lbl.addMouseListener(new MyMouseApdapter());
	      lbl.setSize(100, 20);
	      add(lbl);
	      
	      setSize(200, 200);
	      setVisible(true);

	      // ���̺��� ��Ŀ���� ���� �� �ֵ��� ����
	      Container contentPane = getContentPane();
	      contentPane.addMouseListener(new MyMouseApdapter());
//	      contentPane.setFocusable(true);
//	      // Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����
//	      contentPane.requestFocus();
	   }
	   
	   public static void main(String[] args) {
	      new MouseEventTest3();
	   }
	   
	   class MyMouseApdapter extends MouseAdapter {
	      @Override
	      public void mousePressed(MouseEvent e) {
	         int x = e.getX();
	         int y = e.getY();
	         
	         lbl.setLocation(x, y);
	      }
	   }

	}

