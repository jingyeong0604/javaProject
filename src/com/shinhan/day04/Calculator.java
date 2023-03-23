package com.shinhan.day04;

//class : object를 만들기 위한 틀(설계도)
//oject: class를 이용해서 만들어진 실체(instance)

public class Calculator {
	//1.field(특징, 속성, 변수) :static(class변수), non-static(instance변수)
	private String color;//instance
	private int price;
	private String model;//static -> 모든 calculator가 ABC 모델임 
	static String company="신한";
	
	//2.생성자 (new할때 자동으로 실행되는 메서드) ..컴파일시 자동으로 default생성자가 제공(만들지 않아도 괜찮음)
	//내가 생성자를 정의하면 default생성자는 제공되지 않음
	//생성자는 초기화가 목적
	
	//this : 이 class를 이용해서 만든 객체(new한 현재 객체)
	//1. 매개변수 이름과 멤버변수 이름이 충돌할때 this를 이용해서 구분해줌
	//2.하나의 생성자가 다른 생성자를 호출할 때 사용
	Calculator(String color) {
		this(null, color, 0);
	}
	//생성자 오버로딩 : 이름은 같고 매개변수 사양=>(타입이나 개수)이 다르다.(오버로딩)
	Calculator(String model, String color) {
		this(model, color, 1000);
	}
	
	Calculator(String model, String color,int price) {
		this.setColor(color); 
		this.setModel(model);
		this.setPrice(price);
	}
	
	//3.method(일반 메서드) ...기능(동사):static, non-static
	//void : return값이 없다.
	//static붙어있으면 this 쓸 수 없음. instance생성없이 사용되는 메서드이므로 instatnce변수 사용불가
	
	//private로 정보 은닉되어있는 멤버 변수들을 읽기 하는 기능 만들기 getter
	//private로 정보 은닉되어있는 멤버 변수들을 수정 기능 만들기 setter
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	void powerOn() {
		System.out.println(getColor()+", "+getModel()+"모델의 계산기 전원을 켠다.");
	}
	
	void powerOff() {
		System.out.println(getColor()+", "+getModel()+ " 계산기 전원을 끈다.");
	}
	
	int plus(int a, int b){
		return a+b;
	}
	int divide(int a, int b){
		return a/b;
	}
	int sub(int a, int b){
		return a-b;
	}
	
	
	


	//4.block(instance, static)->잘 안씀
	{
		System.out.println("instance 생성시마다 수행된다.");
		System.out.println("-------------------------");
	}
	
	static {
		System.out.println("class load시 1회 수행된다.");
		System.out.println("-------------------------");
	}
	
	static {
		System.out.println("class load시 2회 수행된다.");
		System.out.println("-------------------------");
	}
	
	//5.inner class
	class AA{
		
	}
	
	
}
