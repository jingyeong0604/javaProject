package com.shinhan.day10;

//매겨변수의 사양이 달라야 오버로딩 리턴은 상관없음.
//----thread.start() 하면 run()호출된다.
//1.thread 상속
class MyThreadA extends Thread{
	MyThreadA(String name){
		super(name);
	}
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(getName()+" : "+i);
			try {
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
//	public int run(int a) {
//		return 1;
//	start는 오버라이딩된 run메소드가 필욯ㅁ.
//	}
}
//2.이미 상속중이라면 Runnable interface 구현
class ThreadB extends Object implements Runnable {

	@Override
	public void run() {
		for(int i=100; i<=110; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}


public class Review {

	public static void main(String[] args) {
		Thread t1 = new MyThreadA("쓰레드A");
		Thread t2 = new Thread(new ThreadB());//runnable을 구현한것 아직 쓰레드는 아님
		
		Thread t4 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=100; i<=110; i++) {
					System.out.println(Thread.currentThread().getName()+" : "+i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
			}
		});
		
		Thread t3 = new Thread() {
			public void run() {
				for (int i = 100; i <= 110; i++) {
					System.out.println(getName() + " : " + i);
					try {
						sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}; 

		t1.start(); t2.start(); t3.start();
		System.out.println("main end~~~");
	}
	
	
	

}
