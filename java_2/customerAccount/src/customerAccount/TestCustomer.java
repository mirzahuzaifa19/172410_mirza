package customerAccount;

public class TestCustomer {
public static void main(String[] args) {
	Customer c=new Customer("mirza", "011", 100);
	Account a=new Account(c, 123);
	a.deposit(20000);
	a.withdraw(100);
	System.out.println(a.toString());
	
}
}
