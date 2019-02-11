package customerAccount;

public class Account {
	Customer customer;
	private int id;
	private	double balance;

public Account(Customer customer, int id, double balance) {
		super();
		this.customer = customer;
		this.id = id;
		this.balance = balance;
	}

public Account(Customer customer, int id) {
	super();
	this.customer = customer;
	this.id = id;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public Customer getCustomer() {
	return customer;
}

public int getId() {
	return id;
}

@Override
public String toString() {
	return "Account [id=" + id + ", balance=" + balance + ", " + customer.toString() + "]";
}
public void deposit(double bal) {
if(bal<0) {
	System.out.println("pls enter positive value");
}
else {
	balance+=bal;
	System.out.println("deposited succesfullt");
}
}
public void withdraw(double bal) {
	if(bal>balance) {
		System.out.println("you have entered more than your balance");
	}
	else {
		balance-=bal;
		System.out.println("withdraw succesfully ");
		System.out.println("thanks for wisiting bank");
	}
}

}
