package com.shinhan.day08;

public class Util {
	
	public static void f() {
		
	}
	
	public static <K,V> V getValue(Pair<K,V> pair, String key) {
		// TODO Auto-generated method stub
		if(pair.getKey().equals(key)) return pair.getValue();
		return null;
	}
	
	public static <P extends Pair<K,V>,K,V> V getValue2(P pair, String key) {
		
		if(pair.getKey().equals(key)) return pair.getValue();
		return null;
	}	
	
}
