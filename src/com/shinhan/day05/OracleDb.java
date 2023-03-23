package com.shinhan.day05;

public class OracleDb extends Object implements JDBCInterface{

	@Override
	public void dbConnect(String dbName) {
		System.out.println("상수접근: "+JDBC);
		System.out.println("상수접근: "+JDBC2);
		//default메서드 호출
		select();
		
		//static메서드 호출
		JDBCInterface.update();
		
		//private 호출불가
	}
	
//	
//	public void select() {
//		System.out.println("select 재정의 가능");
//	}

	@Override
	public void dbConnect2(String dbName) {
		// TODO Auto-generated method stub
		System.out.println("OrableDb dbConnecy2");
	}
	
	
}
