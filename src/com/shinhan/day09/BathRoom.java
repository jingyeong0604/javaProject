package com.shinhan.day09;

//공유영역

public class BathRoom {//전체 동기화시 여기다 붙임.
	boolean isFirst = true;
	void use(String name) {
		
		synchronized (name) {
			if(isFirst && name.equals("김씨")) {
				try {
					wait();//일시정지 상태로 간다. notify를 만날때까지
					//notifyAll(), notify()에 의해 신호오기전까지!!
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			isFirst = false;
			System.out.println(name+" 입장한다.");
			System.out.println(name+" 사용나다..");
			System.out.println(name+" 퇴장한다.");
			System.out.println("--------------------------------");
			notifyAll(); //신호를 보낸다. wait() 상태에 있는 Thread가 실행 대기 상태(Runnable)
			
		}//공유영역에 사용중일 떄 사용 금지

		
//		System.out.println(name+" 입장한다.");
//		System.out.println(name+" 사용나다..");
//		System.out.println(name+" "퇴장한다.");
//		System.out.println("--------------------------------");
	}
}
