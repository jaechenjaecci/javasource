package event;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyEventTest3 extends JFrame {
	   private JLabel lbl = new JLabel("HELLO");
	   
	   public KeyEventTest3() {
	      setTitle("�ؽ�Ʈ �����̱�");
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      // ���� ������ ���̾ƿ� ���ֱ�
	      setLayout(null);
	      
	      // ���̾ƿ��� ���ָ� ��ġ�� �� �� ��� �������� ��ǥ�� �����ؾ��Ѵ�
	      // ���̺� ��ġ
	      lbl.setLocation(50, 50); // ���̺� ��ǥ
	      lbl.addKeyListener(new MyKeyAdaper());
	      lbl.setSize(100, 20);
	      add(lbl);
	      
	      setSize(200, 200);
	      setVisible(true);

	      // ���̺��� ��Ŀ���� ���� �� �ֵ��� ����
	      Container contentPane = getContentPane();
	      contentPane.addKeyListener(new MyKeyAdaper());
	      contentPane.setFocusable(true);
	      // Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����
	      contentPane.requestFocus();
	   }
	   
	   public static void main(String[] args) {
	      new KeyEventTest3();
	   }
	   
	   class MyKeyAdaper extends KeyAdapter {
	      @Override
	      public void keyPressed(KeyEvent e) {
	         // ��,��,��,�� Ű�� ���缭 ���� �̵�
	         // ��� Ű�� ���������� Ȯ��
	         int keyCode = e.getKeyCode();
	         
	         switch(keyCode) {
	         case KeyEvent.VK_UP: // ��
	            lbl.setLocation(lbl.getX(), lbl.getY()-10);
	            break;
	         case KeyEvent.VK_DOWN:
	            lbl.setLocation(lbl.getX(), lbl.getY()+10);
	            break;
	         case KeyEvent.VK_LEFT:
	            lbl.setLocation(lbl.getX()-10, lbl.getY());
	            break;
	         case KeyEvent.VK_RIGHT:
	            lbl.setLocation(lbl.getX()+10, lbl.getY());
	         }
	      }
	   }

	}



