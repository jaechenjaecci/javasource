package Test;

public class TypeTest1 {

	public static void main(String[] args) {
	
		String name = "java";
		String name2 = new String ("java");
		String hobby = null;
		
		System.out.println(name == name2 ? "동일함" : "다름");
		
		System.out.println(name.equals(name2) ? "동일함" : "다름");
		 
		
		System.out.println(hobby);
		System.out.println(hobby.length());
		
	}

}
