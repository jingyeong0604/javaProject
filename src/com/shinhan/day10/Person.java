package com.shinhan.day10;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Person implements Comparable<Person>{
	public String name;
	public int age;
	
//	public Person(String name, int age) {
//		
//	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		if(age<o.age) return -1;
		else if(age==o.age) return 0;
		else return 1;
	}
	
	
}
