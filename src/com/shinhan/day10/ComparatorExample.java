package com.shinhan.day10;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		TreeMap<String, Fruit> data = new TreeMap<>(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1); //descending
			}
		});
		data.put("s", new Fruit("귤", 10000));
		data.put("a", new Fruit("사과", 10000));
		data.put("b", new Fruit("감", 10000));
		data.put("c", new Fruit("배", 10000));
		data.put("d", new Fruit("딸기", 10000));
		
		for(Entry<String, Fruit> entry: data.entrySet()) {
			System.out.println(entry.getKey());
		}
		
		System.out.println("===========================================");
		NavigableMap<String, Fruit> data2 = data.descendingMap();
//		for(Fruit fruit: treeSet) {
//			System.out.println(fruit.name+":"+fruit.price);
//		}
	}

}
