package com.shinhan.day04;

import com.shinhan.day05.Phone;

//같은 패키지 연습
public class ModifierTestDay04 {

	public static void main(String[] args) {
		Phone p=new Phone();
		p.model="갤럭시23";
		System.out.println(p);
		p.f1();
		p.f2();
	
		

	}

}
