package com.shinhan.day09;

//공유영역
public class WorkObject {
	
	public synchronized void methodA(){
		Thread t= Thread.currentThread();
		System.out.println(t.getName()+" 작업실행.........");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//다른 애들을 깨워줌
		}
	}
	

	public synchronized void methodB(){
		Thread t= Thread.currentThread();
		System.out.println(t.getName()+" 작업실행.........");
		notify();//wait 하고 있는애가 있으면 깨워주고 try wait()문으로 들어감.
		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//다른 애들을 깨워줌
		}
	}
	
	
	public synchronized void threadA() {
		
	}
}
