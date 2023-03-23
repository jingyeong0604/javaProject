package com.shinhan.day05;

import com.shinhan.day06.Colorable;

public class LabelTest {
	public static void main(String[] args) {
		Label v1= new Label("이름입력", 20, 5, "black","large");
		Resizable v2= new Label("이름입력", 20, 5, "black","large");
		Colorable v3= new Label("이름입력", 20, 5, "black","large");
		Changeable v4= new Label("이름입력", 20, 5, "black","large");
		
		work(v1);
		//work(v2);
		//work(v3);
	
	}

	private static void work(Changeable aa) {
			if(aa instanceof Label label) {
				label.setBackground(null);
				
			}
	}

}
