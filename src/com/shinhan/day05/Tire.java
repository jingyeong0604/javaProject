package com.shinhan.day05;

//abstract class: 추상메서드가 1개 이상 있다.

public abstract class Tire {
	
	//추상 메서드 : 정의는 있고 구현{}은 없다
	//구현은 상속받은 자식 class가 반드시 한다.(override 의무 )->접근제한자가 같거나 넓어져야함.
	//
	public abstract void roll();
	
	void f1() {
		System.out.println("Tire class f1 method~~~");
	}
	
	void f2() {
		System.out.println("Tire class f2 method~~~");
	}

}
