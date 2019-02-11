package inheritance;

import java.util.Arrays;

public class Teacher extends Person {
	public Teacher(String name, String address) {
		super(name, address);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Teacher [numcourses=" + numcourses + ", courses=" + Arrays.toString(courses) + ", toString()="
				+ super.toString() + "]";
	}
	int numcourses=0;
	String []courses=new String[10];
	public void  addCourseGrade(String course) {
		for(int i=0;i<numcourses;i++) {
			if(	this.courses[numcourses] == course) {
				System.out.println("already presents ");
				break;
			}
			else {
				this.courses[numcourses] = course;
			}
		}
		this.courses[numcourses] = course;
		numcourses++;
	}
	public void  removdeCourseGrade(String course) {
		for(int i=0;i<numcourses;i++) {
			if(	this.courses[numcourses] == course) {
				this.courses[numcourses]=this.courses[numcourses+1];
			}
			else {
				this.courses[numcourses] = course;
			}
	}
	
}
