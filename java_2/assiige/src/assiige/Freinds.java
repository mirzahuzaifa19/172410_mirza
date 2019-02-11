package assiige;

import java.util.ArrayList;
import java.util.Scanner;

public class Freinds {
	int n,k;
	 ArrayList<String> fname = new ArrayList<>();
	 ArrayList<Integer> fmobi1 = new ArrayList<>();
	 ArrayList<Integer> fmobi2 = new ArrayList<>();	
	void addfname() {
		Scanner kb=new Scanner(System.in);
		System.out.println("how much freind required to add");
		n=kb.nextInt();
		System.out.println("add fname");
		for(;k<n;k++) {
		 fname.add(k,kb.next());
		}
	}
	void addfcont() {
		Scanner kb=new Scanner(System.in);
		for(;k<n;k++) {
		System.out.println("add contact 1 of "+fname.get(k));
		 fmobi1.add(k,kb.nextInt());
		System.out.println("add contact 2 of  "+fname.get(k));
		 fmobi2.add(k,kb.nextInt());
		}
	}
	public void searchFre(String name) {	
		 int i = fname.indexOf(name);
		 if(i<0) {
			 System.out.println("not found name");
		 }
		 else {
			 System.out.println(fmobi1.get(i)+" "+fmobi2.get(i));
		 }
	}
}