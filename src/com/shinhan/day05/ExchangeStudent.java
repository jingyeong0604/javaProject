package com.shinhan.day05;

import java.util.Arrays;

public class ExchangeStudent extends Student{
	String[] language;
	
	public ExchangeStudent(String stdId, String name, String[] language) {
		super(stdId, name); //1.부모에서 default 생성자를 정의
							//2.명시적으로 생성자를 호출 v
		//this.setStdId(stdId);
		//this.name= name; 부모에 있는 멤버변수에 집적 접근하는 것은 바람직하지 않음. super 이용하는것이 나음.
		this.language=language; //현재 객체 this
	}
	void display() {
		System.out.println(getClass().getSimpleName()+"에서 추가된 메서드");
	}
	@Override
	public String toString() {
		return "ExchangeStudent [language=" + Arrays.toString(language) + ", name=" + name + ", major=" + major
				+ ", score=" + score + ", schoolName=" + schoolName + "]";
	}
	
//	@Override
//	public String toString() {
//		String aa = super.toString();
//		return aa+ "ExchangeStudent [language=" + Arrays.toString(language) + "]";
//	}
//	
	
	
}
