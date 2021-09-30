package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx3 {
	public static void main(String[] args) {
		InputStream in = System.in;
		OutputStream out = System.out;

		byte b[] = new byte[100];
		// 입력 스트림에서 지정된 바이트 수 만큼 읽어오기

		try {
			while (in.read(b) != -1) {
				out.write(b);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
