package com.shinhan.day06;

public class Button {
	//field
	private ClickListener listener;
	
	//method
	void setLisnser(ClickListener listener) {
		this.listener=listener;
	}
	
	public void buttonClick() {
		listener.onClick();
	}
	
	//내부interface...규격서
	//버튼 전용이므로 안에 인터페이스 작성
	public static interface ClickListener{
		void onClick();
	}

}
