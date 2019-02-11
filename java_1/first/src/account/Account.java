package account;

public class Account {
	private String name;
	private String id;
	private int bal;
	public Account() {
	}
	public Account(String id,String name){
	    this.id=id;
		this.name=name;
	}
	public Account(String id,String name,int bal) {
		  this.id=id;
		this.name=name;
		this.bal=bal;
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
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
public int credit(int amount) {
	bal=bal+amount;
	System.out.println("amount added");
	return bal;
	
}
public int debit(int amount) {
	if(amount>bal) {
		System.out.println("amount exceeded from bal");
	}
	else {
		bal=bal-amount;
		System.out.println("amount debitted");
	}
	return bal;
	
}
public int transferTo(Account another,int amount) {
	if(amount>bal) {
		System.out.println("amount exceeded from bal");
	}
	else {
		bal=bal-amount;
		System.out.println("Amount transfer");
	}
	return bal;
	
}
@Override
public String toString() {
	return "Account [name=" + name + ", id=" + id + ", bal=" + bal + "]";
}

}
