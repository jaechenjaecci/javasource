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
		//1024 크기만큼 반복해서 가져오는 것이기 때문에 한번 가져올 때 1024씩
		//반복해서 파일의 크기만큼 가져옴
		//파일의 크기를 크게할 수록 한번에 가져올 수 있는 데이터의 양이 커지기는 하지만
		//파일의 크기는 버퍼의 크기만큼 지정할 수 있기때문에 무조건 크게 지정할 수는 없음
		
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
