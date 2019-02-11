package com.example;

import java.awt.image.DirectColorModel;

import com.example.domain.Admin;
import com.example.domain.Director;
import com.example.domain.Employee;
import com.example.domain.Engineer;
import com.example.domain.Manager;

public class EmployeeTest {

 public static void main(String[] args) {
	Engineer e=new Engineer(0011, "mirza", "123-45", 2000);
	Manager m=new Manager(011,"beg","123-455", 2000, "IT");
	Admin a=new Admin(00112, "sasi", "12553-455", 200022);
	Director d=new Director(112,"pushp","1-455", 222,333);
	EmployeeTest d2=new EmployeeTest();
	d2.printEmployee(e);
 }
public void printEmployee(Employee e){
	System.out.println(e.getEmployeeId()+" "+e.getEmployeeName()+""+e.getEmployeeSalary()+""+e.getEmployeeSSN()); 
 }
}
