package io;

import java.io.File;

public class FileEx2 {
public static void main(String[] args) {
	File file = new File("c:\\temp\\InputStreamEx1.java");
	
	//�����̸�
	String fileName = file.getName();
	//���� ��ġ �ľ�
	int pos = fileName.lastIndexOf(".");
	//�ڿ��� ���� �� ��ġ�� �˷����
	
	System.out.println("���ϸ� : "+fileName);
	//Ȯ���ڴ� �ʿ���� �����ϰ� ���ϸ� �ʿ��� ���
	System.out.println("Ȯ���ڸ� ������ ���ϸ� : "+fileName.substring(0,pos));
	System.out.println("Ȯ���� : "+fileName.substring(pos+1));
	
	System.out.println("��θ� ������ ���ϸ� : "+file.getPath());
	System.out.println("������ ���� �ִ� ������ : "+file.getParent());
	System.out.println("File.separator : "+file.separator);
	// ���� ������ ������ ���� �ϴ��ĸ� �˷���
	System.out.println("File.pathSeparator : "+file.pathSeparator);
	// ���Ǵ� �ĺ��ڰ� �����̳Ŀ� ���� �ٸ� ������� ����
	
	
}
}
