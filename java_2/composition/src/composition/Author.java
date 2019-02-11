package composition;

public class Author {

public Author(String name, String email, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
String name,email;
char gender;
public String getEmail() {
	return email;
}
public String getName() {
	return name;
}
public char getGender() {
	return gender;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "Author [name=" + name + ", email=" + email + ", gender=" + gender + "]";
}
}
