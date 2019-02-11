package inheritance;

import java.util.Arrays;

public class Student extends Person {
int numcourses=0;
String []courses=new String[10];
int[] grades=new int[10];
	public Student(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}
	public void  addCourseGrade(String course, int grade) {
		this.courses[numcourses] = course;
		this.grades[numcourses] = grade;
		numcourses++;
	}
	public double getAverageGrade() {
		int sum=0;
		for(int i=0;i<numcourses;i++) {
			sum=sum+grades[i];
		}
		return sum/(numcourses);
			
	}
	public void printGrades() {
		System.out.println(getName()+"  ");
		for(int i=0;i<numcourses;i++) {
			System.out.println(courses[i]+" : "+grades[i]);
		}
		
	}
	@Override
	public String toString() {
		return "Student [getName()=" + getName() + ", getAddress()=" + getAddress() + "]";
	}
	

}
