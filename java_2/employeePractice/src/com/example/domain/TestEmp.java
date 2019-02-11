package com.example.domain;

import java.text.NumberFormat;
import java.util.Scanner;

public class TestEmp {
public static void main(String[] args) {
	Employee  e=new Employee(011, "null", "01-22", 200);
	Scanner kb=new Scanner(System.in);
	System.out.println("enter raise sal");
	 e.raiseSalary(kb.nextDouble());
	 e.getEmployeeSalary();
    System.out.println(e.toString());
   // System.out.println(e.getEmployeeSalary());
   System.out.println(NumberFormat.getCurrencyInstance().format(e.getEmployeeSalary()));
}
}
