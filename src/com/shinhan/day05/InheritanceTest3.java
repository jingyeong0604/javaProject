package com.shinhan.day05;

class A {}
class B extends A{}
class C extends A{}
class D extends B{ int max = 100;}
class E extends B{}
class F extends C{}


public class InheritanceTest3 {

	public static void main(String[] args) {//메서드 만듦
	
		f5();
	}
	
	private static void f5() {
		//자동 형변환: 부모타입 = 자식객체
		
		D v1 = new D(); 
		B v2 = new D();
		A v3 = new D();
		
		System.out.println(v1.max);
		//System.out.println(v2.max);
		//강제형변환 : 자식타입객체  = (자식타입)부모타입객체
		D v4 = (D)v2;
		System.out.println(v4.max);
		
		D v5 = (D)v3;
		
		System.out.println(v5.max);

		//E v6= (E)v2; //컴파일시에 오류없음. 실행시 오류 발생

		//본래 생성된 Instance로만 형변환이 가능함.
		
		//E v7=(E)v3;
		
		
		//형변환 가능한지 체크하자
		System.out.println(v3 instanceof D);
		System.out.println(v2 instanceof D);
		
		if(v3 instanceof D dd) {
			//D dd=(D)v3;
			System.out.println(dd.max);
		}
		
	}

	private static void f4() {
		CarTest car=new CarTest();
		car.go(new HankookTire());//재사용
		car.go(new KumhoTire());
		
	}

	private static void f3() {//객체 생성
		Cat c1=new Cat();
		Dog d1=new Dog();
		c1.method1();
		d1.method1();
		call(c1);
		call(d1);
		
	}

	private static void call(Animal ani) {
		ani.method1();
		
		if(ani instanceof Dog) {
			Dog d2=(Dog)ani;//실행시 에러가 날 수 잇음.
			d2.method3();
			System.out.println(d2.a+ d2.c);
		}
		else if(ani instanceof Dog) {
			Cat c2=(Cat)ani;
			c2.method2();
			System.out.println(c2.a+ c2.b);
		}
		
	}

	//field, method는 instance가 아닌 타입을 따른다.
	private static void f2() {
		Cat c1=new Cat();
		System.out.println(c1.a); //부모에 있는 a
		System.out.println(c1.b); 
		c1.method1();//부모에 있는 method1
		c1.method2();
		
	}
	private static void f1() {
		Cat c1=new Cat();
		System.out.println(c1.a);
		c1.method1();
		
	}

}
