package com.shinhan.day06;

public class Radio implements Volume {
	int volLevel;
	
	public  void volumeUp(int volLevel) {
		this.volLevel+=volLevel;
		System.out.println("Radio볼륨을 올립니다."+this.volLevel);
	}
	public void volumeDown(int level) {
		this.volLevel-=volLevel;
		System.out.println("Radio볼륨을 내립니다."+this.volLevel);

	}


}
