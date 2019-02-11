package com.example.domain;

import java.util.Scanner;

public class Employee {
 
@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSSN=" + employeeSSN
				+ ", employeeSalary=" + employeeSalary + "]";
	}
private int employeeId;
 private String employeeName;
 private String employeeSSN;
 private double employeeSalary;
Scanner kb=new Scanner(System.in);
public Employee(int employeeId, String employeeName, String employeeSSN, double employeeSalary) {
	super();
	this.employeeId = employeeId;
	if(employeeName.equals("null")) {
  System.out.println("enter name correctly");
   employeeName=kb.next();
   this.employeeName=employeeName;
	}
	else {
		this.employeeName=employeeName;
	}
	this.employeeSSN = employeeSSN;
	this.employeeSalary = employeeSalary;
}
public int getEmployeeId() {
	return employeeId;
}

public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getEmployeeSSN() {
	return employeeSSN;
}

public double getEmployeeSalary() {
	return employeeSalary;
}
public void raiseSalary(double increase) {
	if(increase<0) {
		System.out.println("pls enter positive amount");
		increase=kb.nextDouble();
	}
	employeeSalary+=increase;
}

}
