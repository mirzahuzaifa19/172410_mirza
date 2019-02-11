package assiige;

import java.util.Scanner;

public class TestArr {
public static void main(String[] args) {
	  
	Freinds f=new Freinds();
	f.addfname();
	f.addfcont();
	System.out.println("enter name which you wants search");
	Scanner kb=new Scanner(System.in);
	f.searchFre(kb.next());
}
}
