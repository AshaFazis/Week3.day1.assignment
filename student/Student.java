package org.student; //create package student

import org.college.College;

public class Student extends College //create class student and use multilevel inheritance
{
	public static void main(String[] args) 
	{
		Student stud = new Student();
		stud.studentName();
		stud.studentDept();
		stud.studentId();
		stud.collegeCode();
		stud.collegeName();
		stud.collegeRank();
		stud.deptName();
		
	} 
	public void studentName() //create method studentname
	{
		System.out.println("Student Name:" + "Asha");
	}
	public void studentDept() //create method studentdept
	{
		System.out.println("Student Department:" + "Computer Science");
	}
	public void studentId() //create method studentid
	{
		System.out.println("Student ID:" + "012");
	}

}
