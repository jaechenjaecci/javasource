package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;


public class BufferedReaderEx2 {
public static void main(String[] args) {
	//BufferedInputStreamEx5 파일을 읽어서 화면의 줄번호와 함께 출력
	
	try(FileReader fr = 
			new FileReader("src/io/BufferedInputStreamEx5.java");
		BufferedReader br = new BufferedReader(fr);	) {
	
		String Line = "";
		int i = 1;
		while((Line=br.readLine())!=null) {
			System.out.println(i+" "+Line);
			i++;
		}
				
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	
	
	
	
	
}
}
