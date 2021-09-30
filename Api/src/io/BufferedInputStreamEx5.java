package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamEx5 {
	public static void main(String[] args) {

		// ���� ��ǲ��Ʈ���� ����ϴ� ��� + ����Ʈ�迭 + ���Ͼƿ�ǲ��Ʈ��
		try (FileInputStream fis = new FileInputStream("c:\\temp\\Rolling.mp3");
			FileOutputStream fos = new FileOutputStream("c:\\temp\\Rolling.mp3")
				) {
			
			byte data[] = new byte[1024];
			
			long start = System.currentTimeMillis();
			while (fis.read(data) != -1) {
				fos.write(data);
			}
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream�� ����+byte+FileOutputStream ����  " 
			+ (end - start));
		} catch (Exception e) {
			e.printStackTrace();
		}

		// ������ǲ��Ʈ�� + ������Ʈ��Ʈ�� ����ϴ� ��� + ����Ʈ�迭

		try (FileInputStream fis = new FileInputStream("c:\\temp\\Rolling.mp3");
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream("c:\\temp\\Rolling_copy5.mp3");
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				) {
			
			byte data[] = new byte[1024];
			
			long start = System.currentTimeMillis();
			while (bis.read(data) != -1) {
				bos.write(data);
			}
			bos.flush();
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream+BufferedInputStream ���� " + (end - start));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
