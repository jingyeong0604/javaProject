package com.shinhan.day04;

import java.util.Date;

import com.shinhan.day03.Car;

public class PacakgeTest {

	public static void main(String[] args) {
		Date d1=new Date();
		System.out.println(d1);
		
		java.sql.Date d2=new java.sql.Date(2023-1900, 2, 24);
		java.sql.Date d3=new java.sql.Date(d1.getTime());
		System.out.println(d2);
		System.out.println(d3);
		
		BookVO v1=new BookVO("자바다",10000);
		//com.shinhan.day05.BookVo b2=new com.shinhan.day05.BookVo("자바다",10000);
		
	}

}
