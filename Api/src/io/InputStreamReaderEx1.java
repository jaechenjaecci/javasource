package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class InputStreamReaderEx1 {
public static void main(String[] args) {
	
	try(InputStreamReader reader = new InputStreamReader
				(new FileInputStream("c:\\temp\\file1.txt"),"ms949");
			//인코딩 방식을 설정할 수 있기 때문에 원본의 글자가 깨지는 것을 방지 가능
			//필수는 아니지만 인코딩 방식이 필요한 경우 사용할 수 있음
			
			FileWriter writer = new FileWriter("c:\\temp\\test3.txt")) {
	
		char cbuf[]= new char[100];
		while(reader.read(cbuf)!=-1) {
			writer.write(cbuf);
		}
		
		
	} catch (Exception e) {

		e.printStackTrace();
	}
}
}
