package com.shinhan.day03;

//class : 설계도, object를 만드는 틀
//object는 클래스를 이용해서 만든 독립된 개체, 실체(instance)
public class Car {
	//1.field(속성, 변수)
	String model;
	String color;
	int price;
	
	//2.생성자 메서드(생성시 초기화가 목적)
	//컴파일시에 자동으로 .class에 파라미터가 없는 default생성자가 만들어진다.
	//즉, 생성자를 정의하는 것은 필수가 아니다.
	//생성자정의하면 default생성자가 자동으로만들어지지는않는다.
	//생성자정의
	public Car(){
		System.out.println("car의 default 메서드 생성");
	}
	
	//3.일반 메서드(method, 기능,동작)
	
	void go(){
		System.out.println("자동차 출발");
	}
	//4.bolck (instatnce block, static block)
	{
		System.out.println("instatnce block...");
	}
	static {
		System.out.println("static block...class load시 1회 수행");
	}
	//5.inner class
}
