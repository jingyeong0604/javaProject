package com.shinhan.day09;

import lombok.Getter;
import lombok.Setter;

@Getter

@Setter

public class SumThread extends Thread {
	
	SumThraed t2 = SumThread(int art, int end);
	public SumThread(int begin, int end) {
		private Long sum;
		int begin;
		int end;
		
		this.begin=begin;
		this.end=end;
		
	}

	@Override
	public void run() {
		for(int i=1; i<=100; i++) sum+=i;
		
	}
} 
	
}
