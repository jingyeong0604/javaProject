package com.shinhan.day02;

import java.util.Scanner;

public class 진경 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//f3();
		
		//f4();
		
		//f5();
		
		//f6();
		
		f7();
	}

	private static void f7() {
		// TODO Auto-generated method stub
		int sum=0;
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("------------------------------");
			System.out.println("1. 예금 | 2.출근 | 3.잔고  |4.종료 ");
			System.out.println("------------------------------");
			System.out.print("선택>");
			int choose=sc.nextInt();
			
			if(choose==1) {
				System.out.print("예금액>");
				int a=sc.nextInt();
				sum+=a;
			}else if(choose==2) {
				System.out.print("출금액>");
				int a=sc.nextInt();
				if(a>sum) System.out.println("잔액부족");
				else sum-=a;
			}else if(choose==3) {
				System.out.print("잔고>");
				System.out.println(sum);
			}else {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println();
		}
	}

	private static void f6() {
		// TODO Auto-generated method stub
		for(int i=1; i<=5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void f5() {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
			for(int j=1; j<=10; j++) {
				if(i*4 + 5*j==60) {
					System.out.println("("+x+", "+y+" )");
				}
			}
		}
		
	}

	private static void f4() {
		// TODO Auto-generated method stub
		while(true) {
			int a=(int) (Math.floor(Math.random()*5)+1);
			int b=(int)(Math.floor(Math.random()*5)+1);
			if(a+b==5) {
				System.out.println("a: "+a+" b: "+b);
				break;
			}
			
			
		}
	}

	private static void f3() {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1; i<=100; i++) {
			if(i%3==0) sum+=i;
		}
		System.out.println(sum);
		
	}

}
