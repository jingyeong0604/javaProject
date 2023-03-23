package com.shinhan.day03;

public class PersonTest {
	public static void main(String[] args) {
			
			Person[] persons=new Person[100];
			
			persons[0]=new Person();
			persons[1]=new Person(20, "홍길동");
		
			for(Person p: persons) {
				p.selfIntroduce();
			}
		
		
	}



	
}
