package com.shinhan.day11;

import java.security.KeyStore.Entry;
import java.util.*;

public class Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f3();
	}
	

	private static void f2() {
		List<Integer> data1 = new ArrayList();
		Set<Integer> data2 = new HashSet();
		Map<String, Integer> data3 = new HashMap();
		data1.add(100);
		data2.add(200);
		data3.put("aa", 300);
		
		System.out.println(data1.get(0));
		for(Integer a: data2) {
			System.out.println(a);
		}
		
		Iterator<Integer> it = data2.iterator();
		
		System.out.println(it.next());
		System.out.println(it.hasNext()? it.next():"not found");
		
		//Map은 키가 있으면 값을 읽을수 있음.
		int value = data3.get("aa");
		System.out.println(value);
		
		//key를 모를때는?
		Set<String> keys = data3.keySet();
		for(String a: keys) {
			System.out.println(a);
			value = data3.get(a);
			System.out.println("key: "+ a+" value: "+ value);
		}
		
		Set<Entry<String, Integer>> entrys = data3.entrySet();
		for(Entry<String, Integer> entry:entrys) {
			System.out.println(entry.getKey()+ entry.getValue());
		}
		
		Iterator<Entry<String, Integer>> it2 = entrys.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
			Entry<String, Integer> en = it2.next();
			System.out.println(en.getKey + en.getValue());
		}
	}

	private static void f1() {
		// TODO Auto-generated method stub
		//Collection : List(순서 있고, 중복가능), Set(순서 없고, 중복 불가)
		//Map
		//List 구현 class : ArrayList, LinkedList, Vector
		//set 구현 class : HashSet(중복체크 : equals, hashcode), 
		//data 추가시 순서 정해짐(크기비교 compareTo()) TreeSet
		//Map 구현 class : HashMap, TreeMap, Properties
		//키와 값의 쌍 entry (key: set이다, value)
	}

}
