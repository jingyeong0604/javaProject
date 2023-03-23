package com.shinhan.day08;

import java.util.Comparator;

public class DecendingInteger implements Comparator<Integer> {
	
	public int compare(Integer o1, Integer o2) {
		return o2-o1;//디센딩
	}
}
