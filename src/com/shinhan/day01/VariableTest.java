package com.shinhan.day01;

//class =변수 + 함수
//VariableTest.java ->컴파일 VariableTest.class
//실행
//1.JVM이 VariableTest class Loader에 의해 Load(static method영역에 올라감)
//->score는 올라가지 않으므로 그래서 쓸 수 없음.
//2.검증
//3.main시작 
public class VariableTest {
	
	int score;//static으로 선언해야함 왜냐하면 변수가 올라가는 순서가 다름. psvm애서 static이 non-static을 사용할 수 없음.
	public static void main(String[] args) {
		// 1.변수 선언
		int a;//지역 변수(local) 초기화하지 않으면 사용이 불가능함.
		
		//2.변수 사용
		a=10;
		System.out.println(a);//읽기
		System.out.println(a+10);//읽기
		
		//3.선언+사용
		int a2=30;
		System.out.println(a2);
		
		
	}

}
