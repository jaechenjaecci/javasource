package io;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileEx3 {
	public static void main(String[] args) {
		File temp = new File("c:\\temp");
		File dir = new File("c:\\temp\\dir");
		File file1 = new File("c:\\temp\\file1.txt");
		File file2 = new File("c:\\temp\\file2.txt");
		File file3 = new File(temp, "file3.txt");
		File file4 = new File("c:\\temp\\dir\\file4.txt");

		if (!temp.exists/* boolean으로 돌아옴 */()) {
			temp.mkdir();
			// 그 위치에 temp라는 폴더가 존재하지 않는다면 그 위치에 폴더를 만드는 명령어
		}

		// 파일 생성
		if (!dir.exists()) {
			dir.mkdir();
		}
		try {
			if (!file1.exists()) {
				file1.createNewFile();
			}
			if (!file2.exists()) {
				file2.createNewFile();
			}
			if (!file3.exists()) {
				file3.createNewFile();
			}
			if (!file4.exists()) {
				file4.createNewFile();
			}

		} catch (Exception e) {

		}
		
		//파일 정보 출력
		System.out.println("\t날짜\t시간\t형태\t크기\t이름");
		System.out.println("-------------------------------------------------");
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		File contents[] = temp.listFiles();
		//파일 배열의 형태로 리턴을 함
		for (File f:contents) {
			System.out.print(sdf.format(new Date(f.lastModified())));
			//long access = f.lastModified(); - 최종 수정 날짜 가져오기
			//date date = new Date(access);  - long타입으로 들어온 시간을 date로 받음
			//String format = sdf.format(date); - date로 나온 자료를 내가 원하는 형태로 출력
			
			if(f.isDirectory()) {
			//현재 접근한 것이 디렉토리라면
				System.out.print("\t<DIR>\t\t"+f.getName());
			//dir 찍고 이름을 찍어줘
			} else {
				System.out.print("\t\t"+f.length()+"\t"+f.getName());
			//f.length()는 파일의 크기를 의미, 아무것도 든게 없어서 0으로 출력
			}System.out.println();
			}
		

		
		
		
		
		
		
		
	}
}
