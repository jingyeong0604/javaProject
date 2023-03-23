package com.shinhan.day06;

public class Speaker implements Volume {
	int volLevel;
	
	public Speaker() {
		
	}
	
	public  void volumeUp(int volLevel) {
		this.volLevel+= volLevel;
		if(this.volLevel>100) this.volLevel=100;
		System.out.println(getClass().getSimpleName()+ "  speak볼륨을 올립니다. " +this.volLevel);
	}
	public void volumeDown(int volLevel) {
		
		this.volLevel-= volLevel;
		if(this.volLevel<0) this.volLevel=0;
		System.out.println(getClass().getSimpleName()+ "  speak볼륨을 내립니다. " + this.volLevel);

	}

}
