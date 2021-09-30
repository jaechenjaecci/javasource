package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamEx5 {
	public static void main(String[] args) {

		// 파일 인풋스트림만 사용하는 경우 + 바이트배열 + 파일아웃풋스트림
		try (FileInputStream fis = new FileInputStream("c:\\temp\\Rolling.mp3");
			FileOutputStream fos = new FileOutputStream("c:\\temp\\Rolling.mp3")
				) {
			
			byte data[] = new byte[1024];
			
			long start = System.currentTimeMillis();
			while (fis.read(data) != -1) {
				fos.write(data);
			}
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream만 사용시+byte+FileOutputStream 사용시  " 
			+ (end - start));
		} catch (Exception e) {
			e.printStackTrace();
		}

		// 파일인풋스트림 + 버퍼인트스트림 사용하는 경우 + 바이트배열

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
			System.out.println("FileInputStream+BufferedInputStream 사용시 " + (end - start));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
