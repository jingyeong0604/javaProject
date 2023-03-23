package com.shinhan.day08;

public class Container<T> {

	T key;
	
	Container(T key){
		this.key = key;
	}
	
	Container(){
		
	}
	
	public void set(T key ) {
		this.key=key;
		
		
	}
	public T getKey() {
		return key;
	}
	public void setKey(T key) {
		this.key = key;
	}

	


}
