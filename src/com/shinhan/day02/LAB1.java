package com.shinhan.day02;

import java.util.Scanner;

public class LAB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//초기값을 정수로 입력하세요. : 1
//마지막 값을 정수로 입력하세요. : 10
//증가분을 정수로 입력하세요. : 1
////총합은 55 입니다
//		Scanner sc=new Scanner(System.in);
//		System.out.print("초기값을 정수로 입력하세요.:");
//		int first=sc.nextInt();
//		
//		System.out.print("마지막 값을 정수로 입력하세요:");
//		int last=sc.nextInt();
//		
//		System.out.print("증가분을 정수로 입력하세요.: ");
//		int plus=sc.nextInt();
//		
//		int sum=0;
//		for(int i=first; i<=last; i+=plus) {
//			sum+=i;
//		}
//		
//		if(sum>1000) sum+=2000;
//		System.out.print("총합은 "+sum+" 입니다.");
//		System.out.print("문자열을 입력하세요.");
//		String str=sc.nextLine();
//		for(int i=1; i<=str.length(); i++) {
//	
//			System.out.println(str.substring(0,i).toUpperCase());
//		}
//		for(int i=0; i<str.length(); i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print(str.charAt(j));
//			}
//			System.out.println();
//		}
//		System.out.print("숫자를 입력하세요.: ");
//		int score=sc.nextInt();
//		
//		int sum=0;
//		if(score%2==0) {
//			for(int i=2; i<=score; i+=2) {
//				sum+=i;
//			}
//		}else {
//			for(int i=1; i<=score; i+=2) {
//				sum+=i;
//			}
//		}
//		System.out.println(sum);
//	}

		method4();
	}

	private static void method4() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("직각 역삼각형을 출력할 줄 수:");
		int rowCount= sc.nextInt();
		for(int row=0; row<rowCount; row++) {
			for(int i=0; i<rowCount-row; i++) {
				System.out.print("*");
			}
		}
	}
}
