package com.shinhan.day07;

public class CellPhone {
	String model;
	double battery;

	public CellPhone(String model)
	{
		this.model = model;
		this.battery= battery;
		// 모델 번호를 인자로 받는 생성자
	}
	
	void  call(int time) {
		// 통화 시간(분)을 출력하고, 통화 시간에 따라 배터리 양을 감소시킨다.
		
		//강제Exception발생, 처리는 안함, RuntimeException에 속한 Exception은 자동으로 throws (던져진다)
		if(time<0) throw new IllegalArgumentException("통화시간입력오류");
		battery -= time * 0.5;
		
		if(battery<0) battery=0;
	}
	void charge(int time) {
		
	}
//	// 감소되는 배터리 양 = 통화시간(분) * 0.5
//	// 배터리 양은 0보다 작아지지 않는다.
//	// 통화 시간(분)이 0보다 작은 경우에는
//	IllegalArgumentException(“통화시간입력오류”)을 발생시킨다.
//	void  charge(int time)	// 충전한 시간(분)을 출력하고, 충전한 시간에 따라 배터리 양을 증가시킨다.
//	// 충전되는 배터리 양 = 충전시간(분) * 3
//	// 배터리 양은 100까지만 증가한다.
//	// 충전 시간(분)이 0보다 작은 경우에는 
//	IllegalArgumentException(“충전시간입력오류”)을 발생시킨다.
//	void  printBattery()	// 남은 배터리 양을 출력한다.
//	boolean  equals(Object otherObject)	// Object 타입의 객체를 입력받고, 입력받은 객체가CellPhone 타입의 클래스이면서 모델 번호가 같은 경우에 true를 리턴한다.
	void printBattery() {
		
	}
	
	//override : 함수이름, 매겨변수 타입과 갯수, return 타입이 모두 같아야하고, 접근 제한자는 같거나 더 넓어져야함.
	//overloading: 매개타입과 갯수가 다르면 Overloading이다.
	
	public boolean equals(Object otherObject) {
		if(otherObject instanceof CellPhone && ((CellPhone) otherObject).model.equals(otherObject)) return true;
		//model이 new 생성시 새로운 문자등이 추가되면 주소가 달라지는 문제가 발생 ->문자열 비교할 수 없음 sol) equals사용
	   // CellPhone p = (CellPhone)otherObject;
//		
		return this.model.equals(otherObject);
	}

}
