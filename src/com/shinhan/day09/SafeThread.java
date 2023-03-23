package com.shinhan.day09;

import lombok.Setter;

@Setter
public class SafeThread extends Thread{
	
	private boolean stop; //false가 default
	
	public void run() {

		
		System.out.println("SafeThread... 실행중");
		if (Thread.interrupted()) { 
			break;
		}

		System.out.println("자원정리");// 절대로 못옴.
		System.out.println("SafeThread 종료");
	}
	
	
//	public void run() {
//		while(!stop) {
//			System.out.println("SafeThread... 실행중");
//		}
//		System.out.println("자원정리");
//		System.out.println("SafeThread 종료");
//	}
//	
	
}
