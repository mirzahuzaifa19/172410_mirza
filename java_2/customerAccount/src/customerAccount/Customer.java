package customerAccount;

public class Customer {
	private String name,id;
	private char gender;
	private int discount;
	public Customer(String name, String id, int discount) {
		super();
		this.name = name;
		this.id = id;
		this.discount = discount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + "]";
	}
	 
}
