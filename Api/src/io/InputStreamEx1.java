package io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {
public static void main(String[] args) {
	
	// System.in Ű���� �Է��� �ǹ�
	InputStream in = System.in;
	int input=0;
	try {
		//int input = in.read();
		//read�� �� ����Ʈ�� ���� �� ����
		//10����Ʈ�� �������� �ݺ����� ���� ������ �ؾ���
		while((input=in.read())!=-1){
			System.out.print((char)input);
		}
		System.out.println((char)input);
		//abcd�� �Է��ϸ� ù��° �ִ� a�� �о 97�� ��µ�
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
}
}
