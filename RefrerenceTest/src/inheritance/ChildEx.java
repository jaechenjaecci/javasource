package inheritance;

public class ChildEx {

	public static void main(String[] args) {

		Child child = new Child(25);
		System.out.println("child age" + child.getAge());
		child.play();
		child.print();
		
		Parent parent = new Child(26);
		System.out.println("child age" + parent.getAge());

	
	parent.print();
	}

}
