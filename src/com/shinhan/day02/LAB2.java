package com.shinhan.day02;

import java.util.Scanner;

public class LAB2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method8();
	}

	private static void method8() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int min=0;
		//boolean flag=flag
		if(a>b) min=b;
		else min=a;
		for(int i=min; i>0; i--) {
			if(a%i==0 && b%i==0){
				System.out.print(i);
				
				return;
			}
		}
	}

	private static void method7() {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int mon=sc.nextInt();
		if(mon<1 || mon>12) {
			System.out.println(mon+"월은 존재하지 않습니다. 다시 입력하세요.");
			return;
		}
		else {
			numDay(mon);
		}
	}

	private static void numDay(int mon) {
		// TODO Auto-generated method stub
		switch(mon) {
			case 1,3,5,7,8,10,12:
				System.out.println(31);
				break;
			case 4,6,9,11:
				System.out.println(30);
				break;
			case 2:
				System.out.println(28);
				break;
				
		}
	
	}

	private static void method6() {
		// TODO Auto-generated method stub
		//주어진 년도의 월에 해당하는 말일을 계산하는 프로그램
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		int mon=sc.nextInt();
		
		boolean flag=false;
//		1)	4의 배수인 해는 윤년.
//		2)	4의 배수이면서 100의 배수인 해는 윤년이 아님.
//		3)	100의 배수이면서 400의 배수인 해는 윤년.

		if(year %4==0) {
			if(year%100!=0 || year%400==0) flag=true;
		}
		
		if(flag)System.out.println("윤년");
		else System.out.println("윤년x");
	}

	private static void method5() {
		// TODO Auto-generated method stub
		int sum=0;
		int a=1;
		for(int i=0; i<15; i++) {
			a+=i;
			sum+=a;
		}
		System.out.println(sum);
	}

	private static void method4() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("양의 정수를 입력하세요 : ");
		int num=sc.nextInt();
		int cnt=0;
		int sum=0;
		for(int i=1; i<=1000; i++) {
			if(i%num==0) {
				cnt++;
				sum+=i;
			}
		}	
		System.out.println(num+"의 배수 개수 = "+ cnt);
		
		System.out.println(num+"의 배수 합 = "+ sum);
		
	}

	private static void method3() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. :");
		int n=sc.nextInt();
		if(n<2 || n>9) {
			System.out.println("잘못된 숫자가 입력되었습니다.");
			return;
		}
		
		for(int i=1; i<=n; i++) {
			int sum=1;
			for(int j=1; j<=i; j++) {
				sum*=j;
			}
			System.out.println(i+" ! = "+ sum);
		}
		
	}

	private static void method2() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("2~100사이의 정수를 입력하세요. : ");
		int num=sc.nextInt(); boolean flag=false;
		for(int i=2; i<num; i++) {
			if(num%i==0) {	
				flag=true;
				break;
				}
			}
		if(flag) System.out.print(num+"는(은) 소수가 아닙니다.");
		else System.out.print(num+"는(은) 소수 입니다.");
		}
	

	private static void method1() {
		// TODO Auto-generated method stub
		//입력받은 숫자의 구구단 출력
		Scanner sc=new Scanner(System.in);
		System.out.print("1보다 크고 10보다 작은 정수를 입력하세요. :");
		int dan=sc.nextInt();
		if(dan<2 || dan>9) {
			System.out.print("잘못된 숫자가 입력되었습니다.");
			return;
		}
		
		for(int i=1; i<=9; i++) {
			System.out.println(dan+" * "+i+" = "+dan*i);
		}
	}
	}

