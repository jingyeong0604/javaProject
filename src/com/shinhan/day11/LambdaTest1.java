package com.shinhan.day11;

public class LambdaTest1 {
	public static void main(String[] args) {
		f5();
	}
	
	private static void f5() {
		Calculable2 f = (a,b) ->a+b;
		Calculable2 f3 = (a,b)->{
			System.out.println("여러문장이라면 {}필요");
			System.out.println("반드시 리턴문을 쓴다.");
			
			return a+b;
		};
		
		Calculable2 f2 = new Calculable2() {
			
			@Override
			public int calculate(int x, int y) {
				// TODO Auto-generated method stub
				return x+y;
			}
		};
		int result1 = f.calculate(1, 2);
		int result2= f2.calculate(1, 2);
		System.out.println(result1);
		System.err.println(result2);
	}

	private static void f4() {
		Person p1 = new Person();
		//익명구현 객체로 구현
		p1.action(new Workable() {
			public void work(String name, String job) {
				System.out.println("이름은 "+name);
				System.out.println("job "+job);
				System.out.println("-------------------");

			}
		});
		
		//람다 구현식 이용
		p1.action((a,b)->System.out.println(a+"---"+b));
		
		p1.action((a,b)->{
			System.out.println(a+"^^^"+b);
			System.out.println(a+"***"+b);
	
		};
	
	p1.action2(s->System.out.println(s+"말하기"));
	
	//리턴이 있는경우
	Speakable f2 = s->s+"!!!!!!!!!";
	p1.action2(f2);
	

	}

	private static void work(Runnable r) {
		Thread t1 = new Thread(r);
		t1.start();
		
	}
	
	private static void f3() {
		work(() ->{System.out.println("A1");});
		work(() ->{System.out.println("A2");});
		work(() ->{System.out.println("A3");});
		work(() ->{System.out.println("A4");});
		work(() ->{System.out.println("A5");});
		
	}

	private static void action(Calculable func) {
		func.calculate(10, 200);//func가 연산 종류를 결정해줌.
	}
	private static void f2() {
		//1.구현class 이용->x
		//2.익명 구현class 이용
//		new Calculable() {
//			public void calculate(int x, int y) {
//				System.out.println("////////익명구현class이용//////");
//				System.out.println("더하기: "+(x+y));
//			}
//		}.calculate(10, 20); // 바로 뒤에 메서드가 있으므로 수행된 결과가 바로 나옴.
//		//->함수 수행시 매번 써야되는 불편함이 있음.
//		
		action(new Calculable() {
			public void calculate(int x, int y) {
				System.out.println("////////익명구현class이용//////");
				System.out.println("더하기: "+(x+y));
			}
		});
		//다른 방법
		Calculable f=new Calculable() {
			public void calculate(int x, int y) {
				System.out.println("////////익명구현class이용//////");
				System.out.println("더하기: "+(x+y));
			}
		};
		action(f);
		
		//빼기 만들기
		Calculable f2=new Calculable() {
			public void calculate(int x, int y) {
				System.out.println("////////익명구현class이용//////");
				System.out.println("빼기: "+(x-y));
			}
		};
		action(f2);
		 //람다식
		Calculable f3=(x,y)->{
			System.out.println("////////람다표현식//////");
			System.out.println("곱하기: "+(x*y));
		};
		action(f3);
	}

	private static void f1() {
		//1. 구현 class이용->구현양이 많음
		MyInterface a= new MyClassImplment();
		a.print();
		
		//2.익명 구현 class 이용->여러번 호출이 가능함.
		(new MyInterface() {
			
			@Override
			public void print() {

				System.out.println("익명구현class 이용......");
			}
		}).print();
		
		
		MyInterface b = new MyInterface() {

			@Override
			public void print() {

				System.out.println("익명구현class 이용......");
			}
		};
		b.print();
		
		//P) 익명구현 불편 sol) 3. 람다식이용...JS: 화살표함수 =>
		//표현법이 이런것임. 구현할때는 익명 구현 클래스가 필요함.
		MyInterface c =()->	System.out.println("람다식이용......");
		c.print();
		
		
	}
}
