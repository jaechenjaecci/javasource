package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx2 {
public static void main(String[] args) {
	InputStream in = System.in;
	OutputStream out = System.out;
	
	
	try {
		int input = in.read();
		out.write(input);
		//write�� ����ϴ� ��� ����ȯ �ʿ���� ���ڸ� 
		//���� �״�� �������
	} catch (IOException e) {
		
		e.printStackTrace();
	} finally {
		try {
			in.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
}
