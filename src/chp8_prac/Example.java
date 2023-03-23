package chp8_prac;

public class Example {
	public static void main(String[] args) {
		action(new B());
		action(new C());
	}

	private static void action(A a) {
		a.method1();
		if(a instanceof C c) {
			c.method2();
		}
		
	}

}
