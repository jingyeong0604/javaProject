package com.shinhan.day02;

public class 반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		forTest4();

	}

	private static void forTest4() {
		// TODO Auto-generated method stub
		int su=1;
		int total=0;
		for(; su<=10; su++) {
			total+=su;
			System.out.println(su+"+");
		}
		System.out.println("="+ total);
	}

}
