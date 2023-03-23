package com.shinhan.day03;

public class Person {
	//멤버변수: instatnce변수, static변수(instatnce변수공유변수)
	static int numberOfPersons;
	//객체가 생성될 때마다 증가해야 하므로 static 붙는다 
	int age;
	String name;
	
//	public Person() {
//		this.age=12;
//		this.name="Anonymous";
//	}
	
	public Person() {
		this(12,"Anonymous");
	}
	

	public Person(int age, String name) {
		this.age=age;
		this.name=name;
		numberOfPersons++;
	}
	
	 void selfIntroduce() {
		// TODO Auto-generated method stub
		Person person=new Person();
		
		System.out.println("내 이름은 "+person.name+"이며, 나이는 "+person.age+"입니다.");
		
		
	}
	 int getPopulation() {
		return numberOfPersons;
		
	}
	
	public static void main(String[] args) {
		Person p1=new Person();
		Person p2=new Person();
		p1.age=30;
		p1.name="홍길동";
		p1.selfIntroduce();
		System.out.println(p1.getPopulation());
	}

}
