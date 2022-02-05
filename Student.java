package org.Student;

import org.College.College;
import org.Dept.Department;

public class Student {
	public void StudentName() {
		System.out.println("shree");
}
	public void StudentDept() {
		System.out.println("Electronics Engineering");
}	
	public void StudentId() {
		System.out.println("13319713");
}
	public static void main(String[]args) {
		College college = new College();
		Department dept=new Department();
		Student student=new Student();
		college.collegeName();
		college.collegeRank();
		college.collegeCode();
		dept.deptName();
		student.StudentDept();
		student.StudentId();
		student.StudentName();
		
	}
}

