package com.shinhan.day03;

import java.util.*;
import java.io.*;

public class EnumTest {
	//상수: 고정값
	final static double PI = 3.141592;
	
	static final int MONDAY = 1;
	static final int SUNDAY = 1;
	static final int SUCCESS = 2;
	
	
	public static void main(String[] args) {
		f3();

	}


	private static void f3() {
		// TODO Auto-generated method stub
		WeekEnum[] weeks= WeekEnum.values();
		for(WeekEnum week : weeks) {
			System.out.println(week);
			String weekName = f4(week);
			System.out.println(weekName);
			
		}
		
	}
	//enum: 한정적인 값들의 묶음, 관련있는 상수들의 묶음
	
	private static String f5(WeekEnum week) {
		// TODO Auto-generated method stub
		String result =null;
		switch (week) {
		case MONDAY: result="월요일";break;
			
			
		
		case TUESDAY: result="화요일";break;
		case WEDESDAY: result="수요일";break;
		case THRUSDAY: result="목요일";break;
		case FRIDAY: result="금요일";break;
		case SATURDAY: result="토요일";break;
	


		default:
			throw new IllegalArgumentException("Unexpected value: " + week);
		}
		return result;
	}

	private static String f4(WeekEnum week) {
		// TODO Auto-generated method stub
		String result =null;
		if(week==WeekEnum.MONDAY) {
			result="월요일";
		}else if(week==WeekEnum.TUESDAY) {
			result="월요일";
		}else if(week==WeekEnum.WEDESDAY) {
			result="월요일";
		}else if(week==WeekEnum.THRUSDAY) {
			result="월요일";
		}else if(week==WeekEnum.FRIDAY) {
			result="월요일";
		}else if(week==WeekEnum.SATURDAY) {
			result="월요일";
		}else {
			
		}
		return result;
			
	}


	private static void f2(LoginEnum login) {
		// TODO Auto-generated method stub
		System.out.println(login == LoginEnum.SUCCESS);
		System.out.println(login == LoginEnum.FAIL);
		
		LoginEnum[] arr = LoginEnum.values();
		for(LoginEnum aa:arr) {
			System.out.println(aa+"=="+aa.name());
		}
	}


	private static void f1() {
		System.out.println(PI);
		int input = 2;
		
		System.out.println(input == SUNDAY);
	}

}
