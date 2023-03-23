package com.shinhan.day09;

import com.shinhan.day05.Account;

public class ThreadTest4 {

	public static void main(String[] args) {
		f10();

	}
	
	private static void f10() {
		AutoSaveThread t1 = new AutoSaveThread();
		t1.setDaemon(true); //main thread 종료시 데몬이 종료
		t1.start();
		

		
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main end");
		
	}

	private static void f8() {
		SafeThread t1 = new SafeThread();
		t1.start();
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			
		}
		t1.interrupt();
		//interrupt 걸면 catch문으로 옴.
	}

	private static void f7() {
		SafeThread t1=new SafeThread();
		t1.start();
		
		try {
			t1.sleep(3000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		t1.setStop(true);
		//사용하지 않는것이 좋다. t1.stop();
	}

	//Thread에서 다른 쓰레드에 신호보내기 : wait(), notify()
	private static void f6() {
		WorkObject obj = new WorkObject();
		ThreadA t1=new ThreadA(obj);
		ThreadB t2= new ThreadB(obj);
		
		t1.start();
		t2.start();
		
	}

	private static void f5() {
		ShareArea share = new ShareArea(
				new Account("12345","이몽룡",2000),
				new Account("678910","성춘향",1000));
		
		TransferThread t1=new TransferThread(share);
		PrintThread t2 = new PrintThread(share);
		t1.start();
		t2.start();
		
	}

	//동기화
	private static void f4() {
		//익명thread 만들기	
		User1Thread t1 = new User1Thread();
		User2Thread t2 = new User2Thread();
		Calculator cal=new Calculator();
		//Calculator는 2개의 Thread가 공유하는 공유영역
		t1.setCalculator(cal); 
		t2.setCalculator(cal); 
		
		
		t1.start();
		
//		 
		
		
		t2.start();
		
		
	}

	//공유영역을 하나의 쓰레드가 사용중일때 다른쓰레드가 접근금지->동기화
	private static void f3() {
		BathRoom bathRoom = new BathRoom();
		BathThread t1= new BathThread(bathRoom, "이씨");
		BathThread t5= new BathThread(bathRoom, "김씨");
		BathThread tw= new BathThread(bathRoom, "zg");
		BathThread te= new BathThread(bathRoom, "ew");
		BathThread tr= new BathThread(bathRoom, "ak");
		
		t1.start(); t5.start(); tw.start(); te.start(); tr.start();
	}

	private static void f2() {
		SumThread t1=new SumThread(1, 50);
		SumThread t2=new SumThread(51, 100);
		t1.start();
		
		try {
			t1.join();
			t2.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t1.getSum());
		System.out.println("main end.....");
		
	}

	private static void f1() throws InterruptedException {
		WorkThread t1= new WorkThread("[쓰레드A]");
		WorkThread t2= new WorkThread("[쓰레드B]");
		t1.start();
		t2.start();
		
		//5초간 일시정지
		Thread.sleep(5000);
		//t1의 work를 false
		t1.work=false;
		//
		//10초 후
		Thread.sleep(10000);
		//t1의 work를 true
		t1.work=true;;
		
		
	}

}
