package com.shinhan.day09;

public class ThreadTest2 {

	public static void main(String[] args) {
		f1();
		System.out.println("main end~~~~~~~~");

	}

	private static void f1() {
		// Thread를 익명구현 객체로 만들기
		//Thread t1 = new MyThread1();
		//Thread t2 = new MyThread2();
		//Thread t3 = new Thread(r);
		
		Thread t1=new Thread() {
			@Override
			public void run() {
				for(char i='A'; i<'Z'; i++) {
					System.out.println("["+ getName()+"i="+ i);
					
					try {
						sleep((int)(Math.random() * 100));
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} //100 ms만큼 쉬는것.
				}
			}
		};
		
		Thread t2 = new Thread() {
			@Override
			public void run() {
				for(int i=1; i<26; i++) {
					System.out.println("["+ getName()+"i="+ i);
					
					try {
						sleep((int)(Math.random() * 100));
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
				}
			}
		};
		
		Thread t3 = new Thread(new Runnable() {	//runnable을 구현하고 있기 때문에 sleep 사용 불가
			@Override
			public void run() {
				for(char i='a'; i<'z'; i++) {
					System.out.println("["+ Thread.currentThread().getName() +"i="+ i);
					
					try {
						Thread.sleep((int)(Math.random() * 100));
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
				}
			}
		});
		
		t1.start();
		t2.start();
		t3.start();
	}

}
