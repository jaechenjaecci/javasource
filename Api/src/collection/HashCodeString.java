package collection;

public class HashCodeString {
public static void main(String[] args) {
	String obj1 = "æ»≥Á«œººø‰";
	String obj2 = new String("æ»≥Á«œººø‰");
	
	System.out.println(obj1.hashCode());
	System.out.println(obj2.hashCode());
	
}
}
