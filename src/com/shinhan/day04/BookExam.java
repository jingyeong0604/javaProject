package com.shinhan.day04;

public class BookExam {
	public static void main(String[] args) {
		System.out.println("책 생성전: "+BookVO.count);
	    BookVO[] b = new BookVO[5];
		b[0] = new BookVO("Java Program",30000);
		
		
		b[1] = new BookVO("JSP Program",25000);
		b[2] = new BookVO("SQL Fundamentals",20000);
		b[3] = new BookVO("JDBC Program",32000);
		b[4] = new BookVO("EJB Program",25000);
		
		System.out.println("책 생성후:" +BookVO.count);
		
		System.out.println(b[0].isbn);
		System.out.println(b[0].isbn2);
		System.out.println(BookVO.Publisher);
		System.out.println(b[0].Publisher);
		
		//****final은 수정불가
		//b[0].isbn="1111";
		//b[0].isbn2="1111";
		//b[0].publisher="AA";
		
	}

}
