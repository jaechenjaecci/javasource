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
		//write를 사용하는 경우 형변환 필요없이 문자를 
		//문자 그대로 출력해줌
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
