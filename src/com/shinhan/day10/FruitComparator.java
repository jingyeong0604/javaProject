package com.shinhan.day10;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit> {

	@Override
	public int compare(Fruit o1, Fruit o2) {
//		return o1.price-o2.price;
		int res= o1.name.compareTo(o2.name);
		if(res==0) return o1.price-o2.price;
		return res;
	}
	
}
