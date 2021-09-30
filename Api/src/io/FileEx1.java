package io;

import java.io.File;

public class FileEx1 {
	public static void main(String[] args) {
		File file = new File("c:\\temp\\test1.txt");
		File file2 = new File("c:\\temp\\test1.txt");
		// 접근하는 것이 아니라, 이렇게 파일처리를 할테니 객체를 생성해달라는 뜻
		// 저 곳에 저 파일이 없어도 현재 상태에서는 오류가 나지 않음
		File file3 = new File("c:\\temp");
		File file4 = new File(file3,"text1.text");

	}
}
