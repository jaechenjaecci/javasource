package io;

import java.io.File;

public class FileEx1 {
	public static void main(String[] args) {
		File file = new File("c:\\temp\\test1.txt");
		File file2 = new File("c:\\temp\\test1.txt");
		// �����ϴ� ���� �ƴ϶�, �̷��� ����ó���� ���״� ��ü�� �����ش޶�� ��
		// �� ���� �� ������ ��� ���� ���¿����� ������ ���� ����
		File file3 = new File("c:\\temp");
		File file4 = new File(file3,"text1.text");

	}
}
