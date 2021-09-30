package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamEx3 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(new File("c:\\temp\\picture.jpg"));
			fos = new FileOutputStream("c:\\temp\\picture_copy.jpg");
			//사진이든 음악이든 컴퓨터에서 처리를 위해서는 0101로 바뀌기 때문에
			//byte로 처리가 가능함
			byte[] datas = new byte[1024];
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
