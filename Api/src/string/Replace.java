package string;

public class Replace {

	public static void main(String[] args) {
		String str1 = "자바는 객체지향 언어입니다. "
				+ "자바는 풍부한 API를 제공합니다.";
		// 한글을 영어로 교환 (자바 -> java)
		// String은 변하지 않음, 처음에 생성된 것은 변경 불가
		// 자체를 변경할 수는 없고, 기존에 있던 문자열을 없애고,
		// 변경한 것을 다시 담아야 함
		//str1= str1.replace("자바", "java");
		//System.out.println(str1);
	
		str1 = str1.replaceFirst("자바", "java");
		System.out.println(str1);
	

	}

}
