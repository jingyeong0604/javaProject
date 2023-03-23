package com.shinhan.day08;

import java.security.DrbgParameters.Reseed;
import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {
		wildcardTest4();

		
		
		
 
	}
	//제네릭타입 제한(extend, super, ?)
		private static void f1(HappyBox<?> param) {
			System.out.println("sfsdfsdfs");
			
		}
	private static void wildcardTest4() {
		HappyBox<String> box=new HappyBox<String>("A", 10);
		
		HappyBox<Integer> box2 = new HappyBox<Integer>(5, 10);
		HappyBox<Integer> box3 = new HappyBox<ChildB>(new ChildB(),10);
		f2(new HappyBox<>("A",10));
		
	}

	private static void wildcardTest3() {
		//?, extend, super
		Course.registerCourse3(new Applicant<Person>(new Person()));
		//Course.registerCourse3(new Applicant<Student>(new Student()));
		Course.registerCourse3(new Applicant<Worker>(new Worker()));
		//Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
		//Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
		
	}
	
	
	
	private static void wildcardTest2() {
		//?, extend, super 
		//? extends Student: Student, Student하위
		//Course.registerCourse2(new Applicant<Person>(new Person()));
		Course.registerCourse2(new Applicant<Student>(new Student()));
		//Course.registerCourse2(new Applicant<Worker>(new Worker()));
		Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
		Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
			
	}
	
	

	private static void method3() {
		genericExtendsMethod(new ChildA());
		genericExtendsMethod(new ChildB());
		//genericExtendsMethod();
//		method4(new HappyBox<>("사과",0));
		
		genericExtendsMethod2(new HappyBox<>("사과",0));
		genericExtendsMethod3(new HappyBox<>(500,0));
		genericExtendsMethod4(new HappyBox<>(new ChildB(), 0));
		
	}
	
	//제네릭타입 제한(extend, super, ?)
	private static void genericExtendsMethod4(HappyBox<? super ChildA> param) {
		System.out.println("? super Number: Number의 자신과 상위만 가능");
		
	}
	
	private static void genericExtendsMethod3(HappyBox<? extends Number> param) {
		System.out.println("? extends Number: Number의 자식만 가능");
		
	}

	private static void genericExtendsMethod2(HappyBox<?> happyBox) {
		System.out.println("?는 제한이 없다.");
		
	}

	private static <T> void method4(T t) {
		System.out.println("genericExtendMethod......");
		System.out.println(t);
		
		
	}

	private static<T extends Parent> void genericExtendsMethod(T param) {
		System.out.println("genericExtendMethod");
		
	}

	private static<? super Parent> void genericExtendsMethod(T param) {
		System.out.println("genericExtendMethod");
		
	}
	
	private static void method2() {
		Integer a=10;
		Integer b=20;
		boolean result=compare(a,b);
		System.out.println(result);
		
		String s1="자바";
		String s2="자바";
		//result = compare(s1, s2);//타입에 제한을 걸어서 number하위가 아니므로 불가능하다.
		//System.out.println(result);
		
	}

	private static void method1() {
		HappyBox<String> box1 = boxing("과일박스");
		HappyBox<Integer> box2 = boxing(200);
		HappyBox<Money> box3 = boxing(new Money(200));
		
	}
	
	//타입에 제한걸기: extends Number는 Number를 상속받은 하위 class만 가능의의미
	public static<T extends Number> boolean compare(T a, T b) {
		return a==b;
		
	}

	private static <T> HappyBox<T> boxing(T kind) {
		return new HappyBox<T>(kind, 10);
		
	}

	private static <T,A,B> int boxing2(T kind, A a, B b,String s) {
		
		return 100;
		
	}
	
	private static void f5() {
		Product<String, Integer> p1=new Product<String, Integer>("책", 1000);
		Product<String, Integer> p2=new Product<String, Integer>("책", 2000);
		System.out.println(p1);
		System.out.println(p1.equals(p1));
		
		
	}

	private static void f4() {
		ArrayList<Money> data=new ArrayList<>();
		data.add(new Money(1));
		data.add(new Money(12));
		data.add(new Money(16));
		data.add(new Money(11));
		data.add(new Money(31));

		
		for(Money s: data) {
			System.out.println(s);
		}
	}

	private static void f3() {
		ArrayList<String> data=new ArrayList<>();
		data.add("월");
		data.add("목");
		data.add("토");
		data.add("월");
		
		for(String s: data) {
			System.out.println(s);
		}
	}

	private static void f2() {
		HappyBox<String> b1=new HappyBox<String>("바나나", 100);
		HappyBox<String> b2=new HappyBox<>("바나나", 100);
		HappyBox<String> b3=new HappyBox<>("책", 100);
		
		String s1=b1.kind;
		
		HappyBox<Money> b4 = new HappyBox<Money>(new Money(10),199);
		
		System.out.printl);
	}

	private static void f1() {
		
		//제네릭스 사용하지 않은 예제
		HappyBox<String> b1=new HappyBox<String>("바나나", 100);
		HappyBox<String> b2=new HappyBox<>("바나나", 100);
		HappyBox<String> b3=new HappyBox<>("바나나", 100);
		
		
		Box b1 = new Box("바나나",233);
		Box b2 = new Box(500,233);
		Box b3 = new Box(new Money)(300),100233);
		
		String s1 = (String)b1.kind;
		int s2 = (Integer)b2.kind;
		Money m = (Money)b3.kind;
		
		System.out.println(s1);
		
	}

}
