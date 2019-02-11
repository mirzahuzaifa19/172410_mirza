package composition;

public class TestAuthor {
public static void main(String[] args) {
	Author a=new Author("mirza", "mirza@capge", 'f');
	Book b=new Book("java",a, 10, 1000);
	System.out.println(b.toString());
}
}
