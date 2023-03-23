package com.shinhan.day05_prac;

public class Student extends Person{
	
	public int studentNo;
	
	public Student(String name,int studentNo) {
		super(name);
		this.studentNo = studentNo;
		// TODO Auto-generated constructor stub
	}
	
	public void study(){
		System.out.println("공부를 합니다.");
	}
}
