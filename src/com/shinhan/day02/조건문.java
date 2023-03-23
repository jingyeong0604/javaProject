package com.shinhan.day02;

import java.util.Scanner;

public class 조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method2();
	}

	private static void method2() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		String grade="";
		switch(score/10) {
			case 10:grade="A";break;
			case 9: grade="B";break;
			case 8:grade="C";break;
		}
		
		String message="";
		int mon=sc.nextInt();
		switch(mon) {
			case 12,1,2: message="겨울"; break;
			case 3,4,5: message="봄"; break;
			case 6,7,8: message="여름"; break;
			default:mesage="월 입력이 잘못되었습니다."ㅣ
		}
		
		
	}

	private static void method1() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("점수>>>");
		int score=sc.nextInt();
		String grade;
		if(score>=90) {
			
		}
	}

}
