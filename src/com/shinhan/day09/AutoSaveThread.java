package com.shinhan.day09;

public class AutoSaveThread extends Thread{
	public void save() {
		System.out.println("작업 내용을 저장함.");
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(10000); //1초 동안 쉬고 save
			}catch(InterruptedException e) {
				break;
			}
			save();
		}
	}
	
	
}
