package com.shinhan.day05;

class Parent{
	int a=10;
	Parent(){
		System.out.println("Parent 생성");
	}
	
	void f1() {
		System.out.println("**부모의 f1 메서드 **");
	}
}
class Child extends Parent{
	String a="자바";
	int b=20;
	
	Child(){
		//super(); 안써도 존재함. 
		System.out.println("child 생성");
	}
	void f2() {
		System.out.println("**부모의 f2 메서드 **");
	}
	
	//오버라이딩
	void f1() {
		super.f1();//부모꺼 먼저 수행하고 내 메소드도 수행하고 싶음.
		System.out.println("**자식의 f1 메서드 **");
	}
}






public class InheritanceTest {

	public static void main(String[] args) {
		Child ch=new Child();
		System.out.println(ch.a);
		System.out.println(ch.b);
		ch.f1();
		ch.f2();

	}

}
