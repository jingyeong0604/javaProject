package com.shinhan.day09;

public class ThreadB extends Thread {
	private WorkObject workObject;
	public ThreadB(WorkObject workObject) {
		setName("ThreadA");
		
		this.workObject = workObject;
	}
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodA();
		}
	}
	
	
	
}
