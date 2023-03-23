package com.shinhan.day04;

//Servlet:Java(주인공) + Html, 서버에서 수행되는 자바 프로그램
//JSP: Html(주인공)+ Java, 실행시 서버가 jsp가 서블릿으로 변경됨
//Servlet은 싱글톤으로 동작한다.new를 1회만 한다.

public class MyServlet {//모든 패키지 겁근가능(public)
	
	private static MyServlet my;
	
	private MyServlet(){
		System.out.println("MyServlet이 생성됨");
	}
	
	public static MyServlet getInstance() {
		if(my==null) my=new MyServlet();
		return my;
	}
	
	public void print() {
		System.out.println("싱글톤연습1");
	}

	public void print2() {
		System.out.println("싱글톤연습2");
	}
	
	
	
}
