package com.shinhan.day01;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f8();
	}

	private static void f8() {
		// TODO Auto-generated method stub
		int a=10;
		float b=20;
		System.out.println("a="+a+", b="+b);
		System.out.printf("!a=%10d  !!b=%3.1f", a,b );
		//System.out.prinf("%d, %6d, %-6d, %06d",a,a,a,a);
	}

	private static void f7() {
		// TODO Auto-generated method stub
		int a=100;
		{
			int b=200;
			System.out.println(a+b);
			
		}
		//block을 벗어나면 변수 사용 불가
		//System.out.println(a+b);
		
		
		
		
	}

	private static void f6() {
		// TODO Auto-generated method stub
		//자바 기본타입: data저장, 연산, 비교
		//byte, short char int float double boolean
		//Wrapper Class: 자바 기본 타입 + 기능(함수)
		//Byte, short, Character, Integer, Long, Float, Double, Boolean
		String score ="100";
		System.out.println(Integer.parseInt(score)+10); //문자 +숫자 => 문자
		

		
	}

	private static void f5() {
		// TODO Auto-generated method stub
		byte v1=10;
		byte v2=20;
		//사칙 연산식에서 byte가 자동으로 int로 변환
		byte v3=(byte)(v1+v2);
		int v4= v1+v2;
		
		System.out.println(v3);
		System.out.println(v4);
		
		
	}

	private static void f4() {
		// TODO Auto-generated method stub
		//강제 형변환 ... data 손실 가능성
		//작은방 = (작은방타입)큰값
		byte v1=9;
		int v3=100;
		v1=(byte)v3;
		System.out.println(v1);
		
	}

	private static void f3() {
		// TODO Auto-generated method stub
		//**자동 형변환
		//큰방 = 작은값
		//byte-1 < short-2 < int-4 < long-8 < float-4 < double-8
		//		char
		//boolean
		byte v1=127;
		short v2=v1;
		//char v3=v1;
		long v4=v1;
		float v5=v1;
		
		System.out.println(v2);
		System.out.println(v4);
		System.out.println(v5);
		
	}

	private static void f2() {
		// TODO Auto-generated method stub
		String str1="자바 '프로그램' 완성";
		String str2="자바 \"프로그램\" 완성";
		String str3="{\"name\": \"홍\", age:20}"; //json 자바스크립트형태의 문자열
		String str4="""
				{"name" : "홍", "age":20}
				""";
		System.out.println(str3);
		System.out.println(str4);
		
		
	}

	private static void f1() {
		// TODO Auto-generated method stub
		//java.base모듈 java.lang패키지 String.class
		//기본형이 아님
		//String: 고정 문자열
		String s1="자바"; //컴파일 시점에 .class의 상수pool
		String s2="자바";
		String s3=new String("자바");//힙이라는 영역에 만들어짐.
		String s4=new String("자바");//실행시 만들어짐.
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(s1==s2);
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		//string으로 더하기하는 것은 좋은 습관이 아님 너무 지저분해진다.
		//stringbuffer에서 string으로 바껴서 주소가 다르게 참조됨.
		s1=s1+"프로그램";
		s2=s2+"프로그램";
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(s1==s2);
	}
	

}
