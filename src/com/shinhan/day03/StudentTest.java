package com.shinhan.day03;

public class StudentTest {

	public static void main(String[] args) {
		f1();
	}

	private static void f1() {
		Student student1=new Student();
//		student1.name="asd";
//		student1.score=123;
//		student1.subject="국어";
		Student student2= new Student("임채희","12344","WEB",200);
		student1.name="김경윤";
		student1.stdId="123456";
		student1.subject="자바";
		student1.score=100;
		
		display(student1);
		display(student2);
	
		
		
	}
	
	private static void display(Student std) {
		System.out.println("------------------------");
		System.out.println(std.name);
		System.out.println(std.stdId);
		System.out.println(std.subject);
		System.out.println(std.score);
		std.study();
	}
	

}
