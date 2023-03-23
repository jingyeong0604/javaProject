package com.shinhan.day06;


/**
 * *
1.변수 : data를 저장하기 위한 기억장소 이름, 값수정 가능
2.상수 : data를 저장하기 위한 기억장소 이름, 값수정 불가능
3.enum: 관련있는 상수묶음
4.method: 문장들을 묶음
5.class : object를 만드는 틀 변수+상수+method
6.object : class로 new한 실체
7.interface: 규격서, 상수+추상메서드 + default method+static method

 *
 */
abstract class Parent{
	abstract void method1();
}
interface MyInterface{
	void method2() {}
}

interface MyInterface2{
	void method2_1();
}

interface MyInterface3 extends MyInterface, MyInterface2{
	void method3_1();
}
class myClass1 extends Parent implements MyInterface3{
	void method1() {}
	public void method2_1() {}
	public void method3_1() {}
	public void method2() {}
}

class myClass2 extends Parent implements MyInterface{
	void method1() {}
	public void method2() {}
}


public class Review {

	public static void main(String[] args) {
		Parent v1=new myClass1();
		work(v1);
		
	}
	static void work(Parent aa) {
		
		aa.method1();
		System.out.println(aa instanceof myClass1);
		System.out.println(aa instanceof Parent);
		System.out.println(aa instanceof myClass2);
		System.out.println(aa instanceof MyInterface);
		System.out.println(aa instanceof MyInterface3);
	
	}

}
