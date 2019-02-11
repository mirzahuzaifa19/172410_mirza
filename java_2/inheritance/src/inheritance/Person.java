package inheritance;

public class Person {
public Person(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

String name,address;

public String getName() {
	return name;
}

public void setAddress(String address) {
	this.address = address;
}

@Override
public String toString() {
	return "Person [name=" + name + ", address=" + address + "]";
}

public String getAddress() {
	return address;
}

}
