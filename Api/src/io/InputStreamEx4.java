package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx4 {
	public static void main(String[] args) {
		InputStream in = System.in;
		OutputStream out = System.out;

		byte[] datas = new byte[100];
		// 사용자로부터 이름과 하고 싶은 말을 입력 받은 후에
		// String 객체로 변환

		System.out.print("이름 : ");
		try {
			int nameBytes = in.read(datas);
			// 읽어온 바이트 수 만큼 알 수 있음
			// Enter:carriage return => 13번, Line feed => 10번
			// 엔터는 두개의 바이트로 연결되어 있기 때문에 2를 뺀다
			String name = new String(datas, 0, nameBytes - 2);
			// 받은 데이터, 읽어올 부분 인덱스,
			// 읽어온 바이트 길이(엔터값 기본으로 들어가기 때문에 엔터값인 -2를 해줌)
			System.out.print("하고 싶은 말 : ");
			int commentsBytes = in.read(datas);
			String comment = new String(datas, 0, commentsBytes - 2);

			System.out.println("입력한 이름 : " + name);
			System.out.println("입력한 하고 싶은 말 : " + comment);

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
