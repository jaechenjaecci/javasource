package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamEx4 {
public static void main(String[] args) {
	FileInputStream fis = null;
	FileOutputStream fos = null;

	try {
		fis = new FileInputStream(new File("c:\\temp\\Rolling.mp3"));
		fos = new FileOutputStream("c:\\temp\\Rolling_copy.mp3");
		
		byte[] datas = new byte[1024];
		//1024 ũ�⸸ŭ �ݺ��ؼ� �������� ���̱� ������ �ѹ� ������ �� 1024��
		//�ݺ��ؼ� ������ ũ�⸸ŭ ������
		//������ ũ�⸦ ũ���� ���� �ѹ��� ������ �� �ִ� �������� ���� Ŀ����� ������
		//������ ũ��� ������ ũ�⸸ŭ ������ �� �ֱ⶧���� ������ ũ�� ������ ���� ����
		
		while (fis.read(datas) != -1) {
			fos.write(datas);
		}
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			fis.close();
			fos.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
}
}
}
