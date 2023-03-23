package com.shinhan.day04;


//오리(Duck) 클래스와 참새(Sparrow) 클래스는 이름을 나타내는 name과 다리의 수를 나타내는 legs, 몸길이를 나타내는 length 데이터를 가지고 있다.
//메소드로는 날다 fly , 
//울다 sing, 
//이름기록하기 setName, 
//문자열출력하기 toString를 가지고 있다.
//
//PlayBird 클래스를 이용하여 두 클래스의 메소드를 호출시켰을 때 콘솔에 출력되는 결과는 다음과 같다.
//fly()  // 날지 않습니다. 날아다닙니다.
//sing() // 소리내어 웁니다. 
//toString() //이름 다리개수, 몸길이를 출력한다. 
//
//[PlayBird 실행결과]
//오리(꽥꽥이)는 날지 않습니다.
//오리(꽥꽥이)가  소리 내어 웁니다.
//오리의 이름은 꽥꽥이 입니다. 다리는 2개이고 길이는 15입니다.
//참새(짹짹)가 날아다닙니다.
//참새(짹짹)가 소리 내어 웁니다.
//참새의 이름은 짹짹 입니다. 다리는 2개이고 길이는 10입니다.

public class Sparrow {
	private String name;
	private int legs;
	private	int length;
	
	public Sparrow(String name, int legs, int length) {
		this.name=name;
		this.legs=legs;
		this.length=length;
	}
	
	public void fly() {
		System.out.println("오리("+name+")은" +"날아다닙니다.");
	}
	public void sing() {
		System.out.println("오리("+name+")은" +"소리내어 웁니다");
	}
	public void setName(String name) {
		this.name = name;
	}
	
	void display() {
		System.out.println("참새의 이름은"
				+name+"입니다. 다리는 "
				+legs+"개이고 길이는 "
				+length+"입니다.");
	}
}
