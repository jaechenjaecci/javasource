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

	   // 키보드이벤트 리스너를 마우스 이벤트 리스너로 변경해보자
	   private JLabel lbl = new JLabel("HELLO");
	   
	   public MouseEventTest3() {
	      setTitle("텍스트 움직이기");
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      // 현재 설정된 레이아웃 없애기
	      setLayout(null);
	      
	      // 레이아웃을 없애면 배치를 할 수 없어서 직접적인 좌표를 설정해야한다
	      // 레이블 배치
	      lbl.setLocation(50, 50); // 레이블 좌표
	      lbl.addMouseListener(new MyMouseApdapter());
	      lbl.setSize(100, 20);
	      add(lbl);
	      
	      setSize(200, 200);
	      setVisible(true);

	      // 레이블이 포커스를 받을 수 있도록 설정
	      Container contentPane = getContentPane();
	      contentPane.addMouseListener(new MyMouseApdapter());
//	      contentPane.setFocusable(true);
//	      // 키 입력을 받을 수 있도록 포커스 강제 지정
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

