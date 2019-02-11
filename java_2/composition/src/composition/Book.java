package composition;

public class Book {
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", authr=" + authr.toString() + ", price=" + price + ", qty=" + qty + "]";
	}
	public Author getAuthr() {
		return authr;
	}
	public void setAuthr(Author authr) {
		this.authr = authr;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
public Book(String name, Author authr, double price, int qty) {
		super();
		this.name = name;
		this.authr = authr;
		this.price = price;
		this.qty = qty;
	}
public Book(String name, Author authr, double price) {
		super();
		this.name = name;
		this.authr = authr;
		this.price = price;
	}
String name;
Author authr;
double price;
int qty=0;
}
