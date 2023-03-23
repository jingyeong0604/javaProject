package chp7_prac;

public class chp7_prac {
 public static void main(String[] args) {
	 f7();
	 f8();
	 f11();
	 f12();
 }

private static void f12() {
	public class A {
		public void method1(){
			System.out.println("A-method1()");
		}
		

	}
	public class B extends A{
		public void method1() {
			System.out.println("B-method1()");
		}
	}
	public class C extends A {
		public void method1() {
			System.out.println("C-method1()");
		}
		public void method2() {
			System.out.println("C-method2()");
		}
	}
	public class Example {
		public static void action(A a) {
			a.method1();
			if(a instanceof C c) {
				c.method2();
			}
		}
		public static void main(String[]args) {
			action(new A());
			action(new B());
			action(new C());
		}
	}

	
}

private static void f11() {
	public class Activity {
		public void onCreate() {
			System.out.println("기본적인 실행 내용");
		}
	}
	public class MainActivity extends Activity {
		@Override
		public void onCreate() {
			super.onCreate();
			System.out.println("추가적인 실행 내용");
		}

	}
	
}

private static void f8() {
	public class Tire {
		public void run() {
			System.out.println("일반 타이어가 굴러갑니다.");
		}
	}
	

	public class SnowTireExample {
		public static void main(String[] args) {
			SnowTire snowTire = new SnowTire();
			Tire tire = snowTire;
		
			snowTire.run();
			tire.run();
	}
	}
	

	public class SnowTire extends Tire{
	@Override
		public void run() {
			System.out.println("스노우 타이어가 굴러갑니다");
		}

	}


	
}

private static void f7() {
	public class Parent {
		public String nation;
		
		public Parent() {
			this("대한민국");
			System.out.println("Parent() call");
		
		}
		
		public Parent(String nation) {
			this.nation=nation;
			System.out.println("Parent(String nation) call");
		}
	}
	
	public class Child extends Parent{
		public String name;
		
		public Child() {
			this("홍길동");
			System.out.println("Child() call");
		}
		
		public Child(String name) {
			this.name=name;
			System.out.println("Child(STring name) call");
		}
	}

	public class ChildExample {
		public static void main(String[] args) {
			Child child = new Child();
		}
	}


	
}
}
