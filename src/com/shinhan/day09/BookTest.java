package com.shinhan.day09;

import java.util.Arrays;

class Box {
	
}
public class BookTest {

	public static void main(String[] args) {
		
		
		Book<String> b1=new Book<String>("이것이 자바다", 30000, 
				"한빛미디어", new String[] {"신용권","임경균"});
		Book<String> b7=new Book<String>("이것이 자바다", 30000, 
				"한빛미디어", new String[] {"신용권","임경균"});
		
		Book<Integer> b2=new Book<>(999, 35000,  
				"한빛미디어", new String[] {"신용권","임경균"});
		
		Book<Box> b3=new Book<>(new Box(), 20000, 
				"한빛미디어", new String[] {"신용권","임경균"});
		

		Book<Box> b4=new Book<>(new Box(), 18000, 
				"한빛미디어", new String[] {"신용권","임경균"});
		
		Book<String> b5=Book.makeBook("자바웹구현", 2000);
		
		Book<Box> b6=Book.makeBook(new Box(), 8000);
		
		
		int res = b1.compareTo(b5);
		System.out.println(res);
		
		System.out.println(b1.equals(b7));
		System.out.println("book count: "+ Book.getCount()+"권");
		
	}

}
