package com.shinhan.day01;

public class VariableTest2 {
	
	
	private static void main(String[] args) {
		
		System.out.println("main 시작");
		
		f3(); //함수 호출 (갔다가 돌아온다)
		System.out.println("main 끝~");
		f1();
	}

	private static void f3() {
		// TODO Auto-generated method stub
		short v1=32767;
		char v2 = 'A';
		int v3= Integer.MAX_VALUE;//2147483647;
		System.out.println(v3);
		long v4=213124124L;
		float v5= 3.14f;
		double v6=3.14;
		
		char v7= 65;
		char v8=0x0041;
		System.out.println(v7);
		System.out.println(v8);
		
		boolean result;
		result= 10>20;
		System.out.println(result);
		
		
		
	}

	private static void f2() {
		// TODO Auto-generated method stub
		//자바의 dataType : 정수(byte-1 short-2 char-2 int-4 long-8)
		//실수 (float-4 double-8)
		//boolean-1 : true, false
		//00000000
		
		byte v1=127;
		System.out.println(Integer.toBinaryString(v1));
		
	}

	private static void f1() {
		int a;
		System.out.println(a=10);
		System.out.println(a==10);
		
	}
	
}
