package stringtokenizer;

import java.util.StringTokenizer;

public class Token1 {
	public static void main(String[] args) {
		String text = "홍길동/성춘향/박연수/이수홍";
		
		String[] names = text.split("/");
		//토크니저와 같은 기능을 가짐
		for (String s:names) {
			System.out.println(s);
		}
		System.out.println();
		
		//공백으로 토큰들이 구분되어 있는 경우, 공백으로도 가능함
		String text1 = "홍길동 성춘향 박연수 이수홍";
		names = text1.split(" ");
		for (String s:names) {
			System.out.println(s);
		}
		
		System.out.println();
		
		StringTokenizer st = 
				new StringTokenizer(text, "/");
		//토큰에서 텍스트를 넘겨주고 슬래시를 기준으로 분리
		//슬래시로 분리되어 나눠진 문자를 토큰이라고 함
		while(st.hasMoreTokens()) {
		//토큰을 가지고 있다면	
			System.out.println(st.nextToken());
		//다음 토큰을 가져오라는 뜻
		}

	}

}
