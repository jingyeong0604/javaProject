package com.shinhan.day04;

//Book 클래스의 제약조건
//1. 책 제목(title)과 가격(price)정보를 저장하는 멤버변수가 있어야 한다.
//2. 멤버변수는 모두 private 접근제한자를 가져야 한다. 
//3. 멤버변수를 모두 초기화하는 생성자 메서드가 있어야 한다. 
//4. 멤버변수에 값을 설정하고 리턴하는 setter/getter 메서드가 있어야 한다.
//setTitle(String title) : 멤버변수 title 값을 셋팅하는 메소드
//String getTitle() : 멤버변수 title 값을 반환하는 메소드
//    void setPrice(int price) : 멤버변수 price 값을 셋팅하는 메소드
//int getPrice() : 멤버변수 price 값을 반환하는 메소드 
//5. setter/getter 메서드는 모두 public 접근제한자를 가져야 한다. 
//

//[BookTest 실행결과]
//=== 책 목록 ===
//Java Program
//JSP Program
//SQL Fundamentals
//JDBC Program
//EJB Program
//
//=== 책 가격의 총합 ===
//전체 책 가격의 합 : 132000

//Book에는 업무로직은 없다.
//VO(Value Object) : data를 저장하는 가방이다.
//DTO(Data Transfer Object) : data를 저장해서 전송하려는 목적으로 만든 class이다.
//JavaBeans기술에서 사용한다.
//멤버변수는 private으로 설정, 멤버 메서드는 public으로 설정한다.
//JspServlet, Spring, Mybatis framework에서 사용된다.

//final: 변수(값 수정 불가), 메서드(override 불가), 클래스(상속불가)
public class BookVO {
	//instance변수
	
	private String title;//인스턴스 변수
	private int price;
	
	//clas변수
	static int count;//클래스 변수
	//final: 수정불가, instance 변수, 선언시 또는 생성시 초기화
	//static final: 수정 불가, 상수, class, 선언시 초기화
	
	static final String Publisher="한빛";
	
	final String isbn ="12345";
	final String isbn2;
	
	public BookVO(String title, int price) {
		System.out.println("day05에 있는 BookVo");
		this.title= title;
		this.price=price;
		isbn2=title+ "67890";
		count++;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BookVO [title=" + title + ", price=" + price + "]";
	}
	
	
}
