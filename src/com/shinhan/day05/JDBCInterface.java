package com.shinhan.day05;

//interface : 규격서(정의있고 구현없음)
public interface JDBCInterface {
	//1.상수(변수는 불가능)
	public static final String JDBC="JAVA Database Connection";
	//생략가능
	String JDBC2 = "JAVA Database Connection";
	//2.추상메서드
	public abstract void dbConnect(String dbName);
	void dbConnect2(String dbName);
	
	
	//3.상위버전에서 추가됨 default method
	default void select() {
		System.out.println("default mehod: 인터페이스를 구현한 모둔 class의 공통코드");
		System.out.println("구현class에서 재정의 가능하다.");
		System.out.println("-------------------------------------------------");
	}
	
	//4.상위버전에서 추가됨 static method
	static void update() {
		System.out.println("static mehod: 인터페이스 소유의 코드");
		System.out.println("구현class에서 재정의 가능하다.");
		System.out.println("-------------------------------------------------");
		insert();
	}
	
	//5.private: default에서 호출
	private static void insert() {
		System.out.println("-------------------------------------------------");

	
}
	
	//6.private static : static 에서 호출
	private static void insert2() {
		System.out.println("-------------------------------------------------");

	
}
