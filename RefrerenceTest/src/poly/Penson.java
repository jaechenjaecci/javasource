package poly;

public class Penson {
private String name;
private String address;
private int age;

public Penson(String name, String address, int age) {
	super();
	this.name = name;
	this.address = address;
	this.age = age;
}

public String getName() {
	return name;
}

public String getAddress() {
	return address;
}

public int getAge() {
	return age;
}

@Override
public String toString() {
	return "Penson [name=" + name + ", address=" + address + ", age=" + age + "]";
}

}

