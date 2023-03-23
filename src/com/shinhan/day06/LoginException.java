package com.shinhan.day06;

//사용자정의예외
//만드는 이유:업무상Exception처리 일관성있게 하기위해 만든다.
//extends Exception
//extends 상위 Exception 
public class LoginException extends Exception{
	String errMessage;
	public LoginException(String errMessage) {
		super(errMessage);
	}
	
	public void printMessage() {
		System.out.println("로그인: "+getMessage());
	}
}
