package org.department;
import org.college.*;
public class Department extends College {

	public void deptName() {
		System.out.println("The Dept is Information Technology");
	}
	
	public static void main(String[] args) {
		
		Department dept=new Department();
		dept.deptName();
		dept.collegeCode();
		dept.collegeName();
		dept.collegeRank();
		
	}

}
