package com.shinhan.day05;

//class : public 또는 생략
//public: 모든 패키지에서 접근가능
//protected:같은 패키지 접근가능, 다른 패키지는 상속받으면 가능
//생략(default): 같은 패키지에서만 접근가능
//private: 같은 class에서만 접근가능
public class Phone {
	//1.field:public/생략/private
	public String model;
	
	//2.생성자: public/protected(상속받지 못하면 쓸 수 없음)/생략/private
	public Phone(){
		System.out.println("default생성자 정의함");
	}
	
	//3.메서드
	public void f1() {
		
	}
	protected void f2() {
		
	}
	void f3() {
		f4();
	}
	private void f4() {
	
	}
}
