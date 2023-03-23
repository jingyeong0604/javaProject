package com.shinhan.day06;

public class TV implements Volume {

	int volLevel;
	
	public  void volumeUp(int volLevel) {
		this.volLevel+=volLevel;
		System.out.println("TV볼륨을 올립니다."+ this.volLevel);
	}
	public void volumeDown(int volLevel) {
		this.volLevel-=volLevel;
		
		if(this.volLevel<0) this.volLevel=0;
		System.out.println("TV볼륨을 내립니다."+this.volLevel);

	}
}
