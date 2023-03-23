package com.shinhan.day06;

class Car{
	class Tire{}
	static class Engine{};
	void go(int score2) {
		int score=100;
		
		class LocalClass{
			void f1() {
				System.out.println(score);
				System.out.println(score2);
			}
		}
		LocalClass v1=new LocalClass();
		System.out.println(v1);
		v1.f1();
	}
}
public class CarExample {
	
	
	public static void main(String[] args) {
		
		Car c1=new Car();
		c1.go(200);
		
		Car.Tire tire = new Car().new Tire();
		Car.Engine engine=new Car().new Engine();
		
	}

}
