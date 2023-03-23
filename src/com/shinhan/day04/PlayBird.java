package com.shinhan.day04;

public class PlayBird {
	public static void main(String[] args) {
		f1();
	}

	private static void f1() {
		Sparrow sp=new Sparrow("짹짹",2,10);
		Duck dk=new Duck("꽥꽥이",2,15);
		sp.fly();
		sp.sing();
		sp.display();
		
		dk.fly();
		dk.sing();
		dk.display();
		
		//
		System.out.println(dk.toString());
	}
}
