package io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {
public static void main(String[] args) {
	
	// System.in 키보드 입력을 의미
	InputStream in = System.in;
	int input=0;
	try {
		//int input = in.read();
		//read는 한 바이트만 읽을 수 있음
		//10바이트를 읽으려면 반복문을 통해 여러번 해야함
		while((input=in.read())!=-1){
			System.out.print((char)input);
		}
		System.out.println((char)input);
		//abcd를 입력하면 첫번째 있는 a만 읽어서 97이 출력됨
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	
}
}
