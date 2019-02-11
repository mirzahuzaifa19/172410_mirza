package com.example.domain;

public class Director extends Manager{
public Director(int employeeId, String employeeName, String employeeSSN, double employeeSalary,String deptName) {
		super(employeeId, employeeName, employeeSSN, employeeSalary,deptName);
		// TODO Auto-generated constructor stub
	}
private double budget;
public double getBudget() {
		return budget;
	}
public Director(int employeeId, String employeeName, String employeeSSN, double employeeSalary, double budget) {
	super(employeeId, employeeName, employeeSSN, employeeSalary);
	this.budget = budget;
}

	
}
