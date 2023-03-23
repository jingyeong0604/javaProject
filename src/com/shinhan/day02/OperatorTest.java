package com.shinhan.day02;

public class OperatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method7();
	}

	private static void method7() {
		// TODO Auto-generated method stub
		int a=70;
		if(a>=70) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
	}

	private static void method6() {
		// TODO Auto-generated method stub
		int a=10;
		a++;
		++a;
		a = a+1;
		
		
	}

	private static void method3() {
		// TODO Auto-generated method stub
		int a=10;
		int b=20;
		boolean result= a>=10 && b==20;
		// &&앞의 결과가 거짓이면 뒷부분 수행안함.
		//&무조건 끝까지 수행함.
		
		// ||앞의 결과가 참이면 뒷부분 수행안함
		// |무조건 끝까지 수행함
		//boolean result = a>10 || ++b==20;
		
		
		System.out.println(result);
	}

	private static void method2() {
		// TODO Auto-generated method stub
		int a=10; 
		int b=5;
		System.out.println(a/b);
		//arithmeticException 정수는 0으로 나눌 수 없음.
		//>>runtimeException 컴파일시에는 오류가 없으나 실행시에 오류
	}

	private static void method1() {
		// TODO Auto-generated method stub
		int a=10;
		int b=5;
		a++;//11
		++a;//12
		System.out.println(++a);//증가 후 사용
		System.out.println(a++);//사용 후 증가
		
	}

}
