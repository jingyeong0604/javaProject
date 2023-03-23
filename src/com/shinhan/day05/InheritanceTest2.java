package com.shinhan.day05;

//ch = new Child() : object 생성 - parent2 생성 - child2 생성
//ch.a ->child가 가지고 잇으면 child의 a를 실행 없으면 부모의 a를 실행

//final class : 자식 상속 불가
//final field : 값 수정 불가
//final method : 재정의 불가
class Parent2{
	int a=10;
	//부모는 자식을 모름
	Parent2(){
		System.out.println("부모생성자");
	}
	
	void method1() {
		System.out.println("부모method");
	}
}

class Child2 extends Parent2{
	//String a="자바"; //덮어쓰기
	int b=20;
	Child2(){
		//super();
		System.out.println("자식생성자");
	}
	
//	void method1() { //덮어쓰기(Override)
//		System.out.println("자식method");
//	}
//	
//	void method1(String b) { //추가 ->오버로딩
//		System.out.println("자식method");
//	}
	void method2() {
		System.out.println("자식 method");
	}
}


public class InheritanceTest2 {

	public static void main(String[] args) {
		f1();
		f2();
		f3();
		f4();

	}

	private static void f4() {
		
		
	}

	private static void f3() {
		//부모를 통해서 자식을 본다 ... 부모의 변수와 메서드만 호출 가능
		Parent2 ch = new Child2();
		System.out.println(ch.a); //+ ch.b);
		ch.method1();
		//ch.method2();
		//부모는 자식을 알 수 없음.
	}

	private static void f2() {
		Child2 ch = new Child2();
		System.out.println(ch.a+ ch.b);
		ch.method1();
		ch.method2();
	}

	private static void f1() {
		Student st1=new Student("123","홍길동");
		Student st2=new Student("124","박기동", "컴공");
		Student st3=new Student("125","최길동","화학",90);
		ExchangeStudent st4=new ExchangeStudent("126", "양길동", new String[] {"영어","프랑스"});
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(st4);
		System.out.println(Student.count);
	}

}
