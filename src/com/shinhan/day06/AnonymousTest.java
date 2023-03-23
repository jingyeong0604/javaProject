package com.shinhan.day06;

public class AnonymousTest {
	public static void main(String[] args) {
		f4();
	}

	private static void f4() {
		RemoteControl tv=new RemoteControl() {
			int a=10;
			public void method() {
				System.out.println("구현class에서 메서드 추가");
			}
			@Override
			public void turnOn() {
				System.out.println("전원켠다"+ a);
				method();
			}

			@Override
			public void turnOff() {
				System.out.println("전원끈다");
				
			}
			
		};
		tv.turnOn();
		tv.turnOff();
		
		
		
	}

	private static void f3() {
		//2.익명객체
		(new Colorable() {
			
			@Override
			public void setForeground(String color) {
				System.out.println("익명...setForeground"+color);
				
			}
			
			@Override
			public void setBackground(String color) {
				System.out.println("익명...setBackground"+color);
				
			}
		}).setBackground("green");
		
		
	}
	
	private static void f2() {
		//2.익명객체
		Colorable a = new Colorable() {
			
			@Override
			public void setForeground(String color) {
				System.out.println("익명...setForeground"+color);
				
			}
			
			@Override
			public void setBackground(String color) {
				System.out.println("익명...setBackground"+color);
				
			}
		};
		a.setBackground("black");
		a.setForeground("purple");
		
	}

	private static void f1() {
		//1.일반적인 방법
		Book book=new Book();
		book.title = "이것이 자바다";
		book.setForeground("white");
		book.setBackground("blue");
		
		Cup cup=new Cup();
		cup.size = 10;
		cup.setForeground("white");
		cup.setBackground("blue");
	}
	
	
}
