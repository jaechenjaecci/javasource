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
	      setTitle("텍스트 움직이기");
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      // 현재 설정된 레이아웃 없애기
	      setLayout(null);
	      
	      // 레이아웃을 없애면 배치를 할 수 없어서 직접적인 좌표를 설정해야한다
	      // 레이블 배치
	      lbl.setLocation(50, 50); // 레이블 좌표
	      lbl.addKeyListener(new MyKeyAdaper());
	      lbl.setSize(100, 20);
	      add(lbl);
	      
	      setSize(200, 200);
	      setVisible(true);

	      // 레이블이 포커스를 받을 수 있도록 설정
	      Container contentPane = getContentPane();
	      contentPane.addKeyListener(new MyKeyAdaper());
	      contentPane.setFocusable(true);
	      // 키 입력을 받을 수 있도록 포커스 강제 지정
	      contentPane.requestFocus();
	   }
	   
	   public static void main(String[] args) {
	      new KeyEventTest3();
	   }
	   
	   class MyKeyAdaper extends KeyAdapter {
	      @Override
	      public void keyPressed(KeyEvent e) {
	         // 상,하,좌,우 키에 맞춰서 글자 이동
	         // 어느 키가 눌러졌는지 확인
	         int keyCode = e.getKeyCode();
	         
	         switch(keyCode) {
	         case KeyEvent.VK_UP: // 위
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



