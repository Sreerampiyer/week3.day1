package org.student;

import org.department.*;
public class Student extends Department  {
	public void studentName() {
		System.out.println("Student name is Sreeram");
	}
	
	
	
	public void studentDept() {
		System.out.println("The dept is IT");
	}
	
	
	public void studentId() {
		System.out.println("7205117");
	}
	
	public static void main(String[] args) {
		
		Student stu=new Student();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
		stu.collegeCode();
		stu.collegeName();
		stu.collegeRank();
		stu.deptName();
	}

}
