package io;

import java.io.File;

public class FileEx2 {
public static void main(String[] args) {
	File file = new File("c:\\temp\\InputStreamEx1.java");
	
	//파일이름
	String fileName = file.getName();
	//점의 위치 파악
	int pos = fileName.lastIndexOf(".");
	//뒤에서 부터 점 위치를 알려줘라
	
	System.out.println("파일명 : "+fileName);
	//확장자는 필요없고 순수하게 파일명만 필요한 경우
	System.out.println("확장자를 제외한 파일명 : "+fileName.substring(0,pos));
	System.out.println("확장자 : "+fileName.substring(pos+1));
	
	System.out.println("경로를 포함한 파일명 : "+file.getPath());
	System.out.println("파일이 속해 있는 폴더명 : "+file.getParent());
	System.out.println("File.separator : "+file.separator);
	// 현재 폴더의 구별을 뭘로 하느냐를 알려줌
	System.out.println("File.pathSeparator : "+file.pathSeparator);
	// 사용되는 식별자가 무엇이냐에 따라 다른 결과값이 나옴
	
	
}
}
